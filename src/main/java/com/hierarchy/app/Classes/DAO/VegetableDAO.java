package com.hierarchy.app.Classes.DAO;


import com.hierarchy.app.Classes.Model.Vegetables;
import org.apache.ibatis.session.SqlSessionFactory;

public class VegetableDAO extends AbstractDAO<Vegetables,Integer>{

    public VegetableDAO(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    protected String getMapperNamespace() {
        return "VegetableDAO";
    }
}
