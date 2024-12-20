package com.hierarchy.app.Classes.DAO;

import com.hierarchy.app.Classes.Model.Product;
import org.apache.ibatis.session.SqlSessionFactory;

public class ProductDAO extends AbstractDAO<Product, Integer>{

    public ProductDAO(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    protected String getMapperNamespace() {
        return "ProductDAO";
    }
}
