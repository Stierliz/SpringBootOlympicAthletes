package com.stirboy.Olympic.Olympic_history.Athletes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AthletesRepository extends JpaRepository<Athletes, Integer> {
//    @Query(value ="SELECT * FROM athletes WHERE sport = ?1",
//    nativeQuery = true)
    List<Athletes> findBySport(String sport);
}