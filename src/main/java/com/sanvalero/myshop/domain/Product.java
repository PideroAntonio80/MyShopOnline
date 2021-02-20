package com.sanvalero.myshop.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "products")

/*  Escribo @Data (línea ?) y se me descpliegan unas opciones de importación, y elijo lombok.Data (cuya dependencia
 *  había añadido al POM al configurar mi proyecto al principio desde Spring.
 *  Con esto consigo automáticamente mis getters y setters (sin que tengan ni que aparecer) y el constructor por defecto
 *  Si quiero un constructor con todos los parámetros escribo @AllArgsConstructor (línea ?) e igualmente me lo incluye
 *  en mi clase (importandome lo que necesito)
 *  El @Entity(name = "products") me hará una tabla products en la bbdd, es decir, me genera una entidad
 *   */

/**
 * Creado por @ author: Pedro Orós
 * el 20/02/2021
 */

public class Product {

    @Id  // Con esto le digo que este campo será clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Con esto hago la primary key autoincremental
    private long id;
    @Column // Esto es un campo de la bbdd (una columna)
    private String name;
    @Column // Esto es un campo de la bbdd (una columna)
    private String description;
    @Column // Esto es un campo de la bbdd (una columna)
    private String category;
    @Column // Esto es un campo de la bbdd (una columna)
    private float price;
    @Column(name = "creation_date") // Esto es un campo de la bbdd (una columna) y además le especifico el nombre que yo quiero
    private LocalDateTime creationDate;
    //private int ejemplo; ---> A este no le he puesto anotación (@) encima luego este campo no lo sería en la bbdd

}
