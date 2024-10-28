package com.hierarchy.app.Classes.DAO;

import com.hierarchy.app.Classes.Model.Meat;

import org.apache.ibatis.session.SqlSessionFactory;

public class MeatDAO extends AbstractDAO<Meat, Integer>{

    public MeatDAO(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    protected String getMapperNamespace() {
        return "MeatDAO";
    }
}
