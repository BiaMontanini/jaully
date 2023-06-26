package br.com.genapps.jaully.controller;

import br.com.genapps.jaully.model.Faculdade;
import br.com.genapps.jaully.repository.FaculdadeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculdade")
@AllArgsConstructor

public class FaculdadeController {
    private final FaculdadeRepository faculdadeRepository;
    @GetMapping
    public List <Faculdade> list() {
        return faculdadeRepository.findAll();
    }

    @PostMapping("/add")
    public Faculdade addFaculdade (@RequestBody Faculdade faculdade) {
        return faculdadeRepository.save(faculdade);
    }

    @PutMapping("/update")
    public Faculdade updateFaculdade(@RequestBody Faculdade faculdade){
        return faculdadeRepository.save(faculdade);
    }

    @DeleteMapping("/remove")
    public void removeFaculdade(@RequestBody Faculdade faculdade) {
        faculdadeRepository.delete(faculdade);
    }
}