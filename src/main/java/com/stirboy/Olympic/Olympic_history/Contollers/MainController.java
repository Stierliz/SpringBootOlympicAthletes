package com.stirboy.Olympic.Olympic_history.Contollers;

import com.stirboy.Olympic.Olympic_history.Athletes.Athletes;
import com.stirboy.Olympic.Olympic_history.Athletes.AthletesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class MainController {

    private AthletesRepository AthletesRepository;

    @Autowired
    public MainController(AthletesRepository AthletesRepository){
        this.AthletesRepository = AthletesRepository;
    }


    @GetMapping(path = "/athletes/{sport}")
    public String findBySport(@PathVariable String sport, Model model){
        List<Athletes> a = AthletesRepository.findBySport(sport);
        a.sort(Comparator.comparing(Athletes::getName));
        model.addAttribute("athletes", a);
        return "showTable";
    }

//    @GetMapping(path = "/athletes/{id}")
//    public /*@ResponseBody Athletes*/ String getAthlete(@PathVariable Integer id, Model model){
//        model.addAttribute("athletes", AthletesRepository
//                .findById(id).get());
//        return "showTable";
////        return AthletesRepository
////            .findById(id).get();
//    }

//    @PostMapping(path = "/athletes/addAthlete")
//    public @ResponseBody String saveAthlete(@RequestParam Integer TableId,@RequestParam Integer id,
//                                            @RequestParam String Name, @RequestParam String Sex,
//                                            @RequestParam Integer Age, @RequestParam String Height,
//                                            @RequestParam String Weight,
//                                            @RequestParam String Team, @RequestParam String NOC,
//                                            @RequestParam String Games, @RequestParam String Year,
//                                            @RequestParam String Season,
//                                            @RequestParam String City, @RequestParam String Sport,
//                                            @RequestParam String Event, @RequestParam String Medal){
//        Athletes tmp = new Athletes(TableId, id, Name, Sex,
//                Age, Height, Weight, Team, NOC,
//                Games, Year, Season, City, Sport,
//                Event, Medal);
//        AthletesRepository.save(tmp);
//        return "Saved";
//    }

//    @RequestMapping(value = "/delete/{TableId}", method = {RequestMethod.DELETE,RequestMethod.GET})
//    public void deleteAthlete(@PathVariable Integer TableId){
//        Athletes a = AthletesRepository.findById(TableId).get();
//        AthletesRepository.delete(a);
//    }
//
    @GetMapping(path="/athletes/showTable")
    public String getFirstTen(Model model){
        List<Athletes> a = new ArrayList<>();
        for(int i = 1; i <= 10; ++i){
            if(AthletesRepository.findById(i).isPresent())
                a.add(AthletesRepository.findById(i).get());
        }
        // Collections.sort(a, new Comparator<Athletes>() {
        //     @Override
        //     public int compare(Athletes a, Athletes b) {
        //         return a.getName().compareTo(b.getName());
        //     }
        // });
        model.addAttribute("athletes", a);

        return "showTable";
    }
//
//    @GetMapping(path="/athletes/all")
//    public @ResponseBody Iterable<Athletes> getAll(){
//        return AthletesRepository.findAll();
//    }

}