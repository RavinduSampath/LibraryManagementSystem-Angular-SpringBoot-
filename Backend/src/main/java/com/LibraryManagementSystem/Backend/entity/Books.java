package com.LibraryManagementSystem.Backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(nullable = false, length = 100)
    private String author;

    @Column(nullable = false, length = 50)
    private String isbn;

    @Column(nullable = false)
    private int publishedYear;

    @Column(nullable = false)
    private int availableCopies;

}
