package com.LibraryManagementSystem.Backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "late_fees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LateFees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "borrow_id", nullable = false, unique = true)
    private BorrowDetails borrowDetails;

    @Column(nullable = false)
    private BigDecimal fineAmount;

    @Column(nullable = false)
    private boolean isPaid;

    @Column(nullable = false)
    private LocalDate dueDate;
}
