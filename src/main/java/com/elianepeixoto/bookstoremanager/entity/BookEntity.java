package com.elianepeixoto.bookstoremanager.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data //Getter, Setter, Equals, Hashcode
@Builder
@NoArgsConstructor // construtor sem argumentos
@AllArgsConstructor // construtor com argumentos

public class BookEntity {
   @Id
   @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

   @Column(nullable = false, unique = true)
    private String name;

   @Column(nullable = false)
    private Integer pages;

   @Column(nullable = false)
    private Integer chapters;

   @Column(nullable = false)
    private Integer isbn;

   @Column(name = "publish_name", nullable = false, unique = true)
    private String publisherName;

   @ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name= "author_id")
    private Author author;


}
