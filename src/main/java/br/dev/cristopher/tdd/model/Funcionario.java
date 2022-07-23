package br.dev.cristopher.tdd.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;
    public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario.setScale(1);
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
    public BigDecimal getSalario() {
        return salario.setScale(1);
    }
    public void reajustarSalario(BigDecimal reajuste) {
        this.salario = this.salario.add(reajuste);
    }
}
