package com.hierarchy.app.Classes.DAO;

import org.apache.ibatis.session.SqlSessionFactory;

import com.hierarchy.app.Classes.Model.Chocolate;

public class ChocolateDAO extends AbstractDAO<Chocolate, Integer> {

    public ChocolateDAO(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    protected String getMapperNamespace() {
        return "ChocolateDAO";
    }
    
}
