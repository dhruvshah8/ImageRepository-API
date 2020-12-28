package tech.dhruvshah.crud.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")

// MODEL CLASS
public class Product {

    @Id
    @GeneratedValue
    private int id; // primary key
    private String name;
    private int quantity;
    private double price;
    private String location;

}
