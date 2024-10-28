package com.hierarchy.app.Classes.DAO;

import org.apache.ibatis.session.SqlSessionFactory;

import com.hierarchy.app.Classes.Model.Dairy;

public class DairyDAO extends AbstractDAO<Dairy, Integer> {

    public DairyDAO(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    protected String getMapperNamespace() {
        return "DairyDAO";
    }
    
}
