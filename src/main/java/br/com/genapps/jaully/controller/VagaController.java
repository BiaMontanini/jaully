package br.com.genapps.jaully.controller;

import br.com.genapps.jaully.model.Vaga;
import br.com.genapps.jaully.repository.VagaRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vaga")
@AllArgsConstructor

public class VagaController {
    private final VagaRepository vagaRepository;
    @GetMapping
    public List <Vaga> list() {
        return vagaRepository.findAll();
    }

    @PostMapping("/add")
    public Vaga addVaga (@RequestBody Vaga vaga) {
        return vagaRepository.save(vaga);
    }

    @PutMapping("/update")
    public Vaga updateVaga(@RequestBody Vaga vaga){
        return vagaRepository.save(vaga);
    }

    @DeleteMapping("/remove")
    public void removeVaga(@RequestBody Vaga vaga) {
        vagaRepository.delete(vaga);
    }
}
