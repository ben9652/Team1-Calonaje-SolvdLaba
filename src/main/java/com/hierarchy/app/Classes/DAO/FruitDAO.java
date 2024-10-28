package com.hierarchy.app.Classes.DAO;

import com.hierarchy.app.Classes.Model.Fruit;
import org.apache.ibatis.session.SqlSessionFactory;

public class FruitDAO extends AbstractDAO<Fruit, Integer> {

    public FruitDAO(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    protected String getMapperNamespace() {
        return "FruitDAO";
    }
}