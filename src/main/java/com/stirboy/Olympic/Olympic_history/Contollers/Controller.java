package com.stirboy.Olympic.Olympic_history.Contollers;

import java.util.ArrayList;
import java.util.List;

import com.stirboy.Olympic.Olympic_history.Athletes.Athletes;
import com.stirboy.Olympic.Olympic_history.Athletes.AthletesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/athletes")
public class Controller {

    @Autowired
    private AthletesRepository AthletesRepository;

    @GetMapping(path="/{id}")
    public Athletes getAthlete(@PathVariable Integer id){
        return AthletesRepository
        .findById(id).get();
    }

    //error is here
    // @GetMapping(path="/{findName}")
    // public List<Athletes> findNameTable(@PathVariable String findName){
    //     return AthletesRepository.findByName(findName);
    // }

    @GetMapping(path="/firstTen")
    public List<Athletes> getFirstTen(){
        List<Athletes> a = new ArrayList<>();
        for(int i = 1; i <= 10; ++i){
            a.add(AthletesRepository.findById(i).get());
        }
        return a;
    }

    @GetMapping(path="/all")
    public Iterable<Athletes> getAll(){
        return AthletesRepository.findAll();
    }

}