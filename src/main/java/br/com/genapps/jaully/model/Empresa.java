package br.com.genapps.jaully.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nomeDaEmpresa;

    @Column(length = 100, nullable = false)
    private String nomeFantasia;

    @Column(length = 15, nullable = false)
    private String cep;

    @Column(length = 400, nullable = false)
    private String endereco;

}