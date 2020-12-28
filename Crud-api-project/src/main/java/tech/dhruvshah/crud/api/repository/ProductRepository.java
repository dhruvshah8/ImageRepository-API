package tech.dhruvshah.crud.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.dhruvshah.crud.api.entity.Product;

import java.util.Optional;

public interface ProductRepository  extends JpaRepository<Product, Integer> {


    Product findByName(String name);
}
