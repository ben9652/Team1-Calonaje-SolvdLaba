package com.hierarchy.app.Classes.Service;

import com.hierarchy.app.Classes.DAO.ProductDAO;
import com.hierarchy.app.Classes.Model.Product;

import java.util.List;

public class ProductService {
    private final ProductDAO productDAO;


    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public Product getProductById(int id){return productDAO.findById(id);}

    public List<Product> getAllProducts(){return productDAO.getAll();}

    public void addProduct(Product product){productDAO.insert(product);}

    public void updateProduct(Product product){productDAO.update(product);}

    public void deleteProduct(int id){productDAO.delete(id);}
}
