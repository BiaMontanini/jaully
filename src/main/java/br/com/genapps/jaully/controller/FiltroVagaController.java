package br.com.genapps.jaully.controller;

import br.com.genapps.jaully.model.FiltroVaga;
import br.com.genapps.jaully.repository.FiltroVagaRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/filtrovaga")
@AllArgsConstructor

public class FiltroVagaController {
    private final FiltroVagaRepository filtroVagaRepository;
    @GetMapping
    public List <FiltroVaga> list() { return filtroVagaRepository.findAll();}

    @PostMapping("/add")
    public FiltroVaga updateFiltroVaga(@RequestBody FiltroVaga filtroVaga) {return filtroVagaRepository.save(filtroVaga);}


    @PutMapping("/update")
    public FiltroVaga updatefiltroVaga(@RequestBody FiltroVaga filtroVaga) { return filtroVagaRepository.save(filtroVaga);}

    @DeleteMapping("/remove")
    public void removeFiltroVaga(@RequestBody FiltroVaga filtroVaga) { filtroVagaRepository.delete(filtroVaga);}

}