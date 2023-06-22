package br.com.genapps.jaully.controller;

import br.com.genapps.jaully.model.Aluno;
import br.com.genapps.jaully.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aluno")
@AllArgsConstructor

public class AlunoController {
    private final AlunoRepository alunoRepository;
    @GetMapping
    public List <Aluno> list() {
        return alunoRepository.findAll();
    }

    @PostMapping("/add")
    public Aluno addAluno (@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @PutMapping("/update")
    public Aluno updateAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @DeleteMapping("/remove")
    public void removeAluno(@RequestBody Aluno aluno) {
        alunoRepository.delete(aluno);
    }
}