package org.example.lab4.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.lab4.Model.Product;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Product {

    private String title;


}
