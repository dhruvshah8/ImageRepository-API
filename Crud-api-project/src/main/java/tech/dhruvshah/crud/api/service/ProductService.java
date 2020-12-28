package tech.dhruvshah.crud.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.dhruvshah.crud.api.entity.Product;
import tech.dhruvshah.crud.api.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


    // POST METHODS
    public Product saveProduct(Product product){
        return repository.save(product);
    }
    public List<Product> saveProducts (List<Product> products){
        return repository.saveAll(products);
    }


    // GET METHODS

    public List<Product> getProducts (){
        return repository.findAll();
    }
    public Product getProductById (int id){
        return repository.findById(id).orElse( null);
    }
    public Product getProductByName (String name){
        return repository.findByName(name);
    }


    // DELETE METHODS

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    //
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }


}
