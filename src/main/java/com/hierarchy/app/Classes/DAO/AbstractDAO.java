package com.hierarchy.app.Classes.DAO;

import com.hierarchy.app.Classes.Interfaces.GenericDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import java.util.List;


public abstract class AbstractDAO<T,U> implements GenericDAO<T,U> {
    protected SqlSessionFactory sqlSessionFactory;

    public AbstractDAO(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public T findById(int id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectOne(getMapperNamespace() + ".findById", id);
        }
    }

    @Override
    public List<T> getAll() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.selectList(getMapperNamespace() + ".findAll");
        }
    }

    @Override
    public void insert(T product) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.insert(getMapperNamespace() + ".insert", product);
            session.commit();
        }
    }

    @Override
    public void update(T product) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.update(getMapperNamespace() + ".update", product);
            session.commit();
        }
    }

    @Override
    public void delete(int id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            session.delete(getMapperNamespace() + ".delete", id);
            session.commit();
        }
    }

    protected abstract String getMapperNamespace();
}
