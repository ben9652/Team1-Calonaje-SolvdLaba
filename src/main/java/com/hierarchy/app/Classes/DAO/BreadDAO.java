package com.hierarchy.app.Classes.DAO;

import com.hierarchy.app.Classes.Model.Bread;
import org.apache.ibatis.session.SqlSessionFactory;

public class BreadDAO extends AbstractDAO<Bread, Integer> {

    public BreadDAO(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    protected String getMapperNamespace() {
        return "BreadDAO";
    }
}
