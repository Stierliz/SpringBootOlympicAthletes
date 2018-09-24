package com.stirboy.Olympic.Olympic_history.Athletes;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AthletesRepository extends CrudRepository<Athletes, Integer>{

    // @Query(value="SELECT * FROM athletes WHERE athletes.Name LIKE "
    // +"(CONCAT('%',:findName,'%'))",
    // nativeQuery = true)
    // public List<Athletes> findByName(@Param("findName") String findName);
}