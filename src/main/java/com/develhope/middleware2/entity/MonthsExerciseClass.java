package com.develhope.middleware2.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class MonthsExerciseClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;
}
