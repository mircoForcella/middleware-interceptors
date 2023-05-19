package com.develhope.middleware2.repository;

import com.develhope.middleware2.entity.MonthsExerciseClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthExerciseClassRepository extends JpaRepository<MonthsExerciseClass, Integer> {
}
