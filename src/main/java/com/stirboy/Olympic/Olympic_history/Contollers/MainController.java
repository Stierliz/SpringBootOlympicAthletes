package com.stirboy.Olympic.Olympic_history.Contollers;

import java.util.*;

import com.stirboy.Olympic.Olympic_history.Athletes.Athletes;
import com.stirboy.Olympic.Olympic_history.Athletes.AthletesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Controller
public class MainController {

    private AthletesRepository AthletesRepository;

    @Autowired
    public MainController(AthletesRepository AthletesRepository){
        this.AthletesRepository = AthletesRepository;
    }

    @GetMapping(path="/athletes/{id}")
    public @ResponseBody Athletes getAthlete(@PathVariable Integer id){
        return AthletesRepository
            .findById(id).get();
    }

    @PostMapping(path = "/athletes/addAthlete")
    public @ResponseBody String saveAthlete(@RequestParam Integer TableId,@RequestParam Integer id,
                                            @RequestParam String Name, @RequestParam String Sex,
                                            @RequestParam Integer Age, @RequestParam String Height,
                                            @RequestParam String Weight,
                                            @RequestParam String Team, @RequestParam String NOC,
                                            @RequestParam String Games, @RequestParam String Year,
                                            @RequestParam String Season,
                                            @RequestParam String City, @RequestParam String Sport,
                                            @RequestParam String Event, @RequestParam String Medal){
        Athletes tmp = new Athletes(TableId, id, Name, Sex,
                Age, Height, Weight, Team, NOC,
                Games, Year, Season, City, Sport,
                Event, Medal);
        AthletesRepository.save(tmp);
        return "Saved";
    }

    @RequestMapping(value = "/delete/{TableId}", method = {RequestMethod.DELETE,RequestMethod.GET})
    public void deleteAthlete(@PathVariable Integer TableId){
        Athletes a = AthletesRepository.findById(TableId).get();
        AthletesRepository.delete(a);
    }

    //error is here
    // @GetMapping(path="/{findName}")
    // public List<Athletes> findNameTable(@PathVariable String findName){
    //     return AthletesRepository.findByName(findName);
    // }

    @GetMapping(path="/athletes/firstTen")
    public String getFirstTen(Model model){
        List<Athletes> a = new ArrayList<>();
        for(int i = 1; i <= 10; ++i){
            a.add(AthletesRepository.findById(i).get());
        }
        // Collections.sort(a, new Comparator<Athletes>() {
        //     @Override
        //     public int compare(Athletes a, Athletes b) {
        //         return a.getName().compareTo(b.getName());
        //     }
        // });
        model.addAttribute("athletes", a);

        return "firstTen";
    }

    @GetMapping(path="/athletes/all")
    public @ResponseBody Iterable<Athletes> getAll(){
        return AthletesRepository.findAll();
    }

}