package br.com.genapps.jaully.controller;

import br.com.genapps.jaully.model.Acessar;
import br.com.genapps.jaully.repository.AcessarRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/acessar")
@AllArgsConstructor

public class AcessarController {
    private final AcessarRepository acessarRepository;
    @GetMapping
    public List <Acessar> list() {
        return acessarRepository.findAll();
    }

    @PostMapping("/add")
    public Acessar addAcessar (@RequestBody Acessar acessar) {
        return acessarRepository.save(acessar);
    }

    @PutMapping("/update")
    public Acessar updateAcessar(@RequestBody Acessar acessar){
        return acessarRepository.save(acessar);
    }

    @DeleteMapping("/remove")
    public void removeAcessar(@RequestBody Acessar acessar) {
        acessarRepository.delete(acessar);
    }
}