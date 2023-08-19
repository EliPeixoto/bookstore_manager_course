package com.elianepeixoto.bookstoremanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEntity {
    //mapeamento de todos atributos conforme modelagem
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique = true)
    private Long name;

    @Column(nullable=false)
    private Integer age;
}
