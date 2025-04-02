package com.LibraryManagementSystem.Backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "borrow_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BorrowDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrow_id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Books book;

    @Column(nullable = false)
    private LocalDate borrowDate;

    @Column(nullable = true)
    private LocalDate returnDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BorrowStatus status;
}
