package br.com.genapps.jaully.repository;

import br.com.genapps.jaully.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
