package com.elianepeixoto.bookstoremanager.entity;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data

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
    private AuthorEntity author;


}
