package br.dev.cristopher.tdd.service;

import br.dev.cristopher.tdd.model.Funcionario;

import java.math.BigDecimal;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario) {

        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1")).setScale(1);

        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            valor = BigDecimal.ZERO;
        }

        return valor;
    }

}
