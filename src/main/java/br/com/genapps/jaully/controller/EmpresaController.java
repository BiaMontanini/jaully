package br.com.genapps.jaully.controller;

import br.com.genapps.jaully.model.Empresa;
import br.com.genapps.jaully.repository.EmpresaRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
@AllArgsConstructor

public class EmpresaController {
    private final EmpresaRepository empresaRepository;
    @GetMapping
    public List <Empresa> list() {
        return empresaRepository.findAll();
    }

    @PostMapping("/add")
    public Empresa addEmpresa (@RequestBody Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @PutMapping("/update")
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaRepository.save(empresa);
    }

    @DeleteMapping("/remove")
    public void removeEmpresa(@RequestBody Empresa empresa) {
        empresaRepository.delete(empresa);
    }
}