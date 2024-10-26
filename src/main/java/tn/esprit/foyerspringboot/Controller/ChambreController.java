package tn.esprit.foyerspringboot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.foyerspringboot.entities.Chambre;
import tn.esprit.foyerspringboot.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {
    IChambreService chambreService;

    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c){
        return chambreService.addChambre(c);
    }

    @GetMapping("/findAll")
    List<Chambre> findAll(){
        return chambreService.getAllChambre();
    }

    @PutMapping("/updateChambre")
    Chambre updateChambre(@RequestBody Chambre c){
        return chambreService.updateChambre(c);
    }

    @DeleteMapping("/deleteChambre/{id}")
    void deleteChambre(@PathVariable Long id){
        chambreService.deleteChambre(id);
    }
    //farah
}