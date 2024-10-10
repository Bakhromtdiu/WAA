package org.example.lab4.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.lab4.Model.Product;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CD extends Product {
    private String artist;
}
