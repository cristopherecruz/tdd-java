package br.dev.cristopher.tdd.service;

import br.dev.cristopher.tdd.model.Desempenho;
import br.dev.cristopher.tdd.model.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
         BigDecimal percentual =  desempenho.getReajuste();

         BigDecimal reajuste = funcionario.getSalario().multiply(percentual);

         funcionario.reajustarSalario(reajuste);
    }
}
