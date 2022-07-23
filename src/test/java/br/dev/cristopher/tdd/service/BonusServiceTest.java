package br.dev.cristopher.tdd.service;

import br.dev.cristopher.tdd.model.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService bonusService = new BonusService();

        Funcionario funcionario = new Funcionario("Cristopher", LocalDate.now(), new BigDecimal("25000"));

        assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(funcionario));
    }

    @Test
    void bonusDeveriaDezPorcentoDoSalario() {
        BonusService bonusService = new BonusService();

        Funcionario funcionario = new Funcionario("Cristopher", LocalDate.now(), new BigDecimal("2500"));

        BigDecimal bonus = bonusService.calcularBonus(funcionario);

        assertEquals(new BigDecimal("250").setScale(1), bonus);
    }

    @Test
    void bonusDeveriaSerDezPorcentoParaSalarioExatamenteDezMilReais() {
        BonusService bonusService = new BonusService();

        Funcionario funcionario = new Funcionario("Cristopher", LocalDate.now(), new BigDecimal("10000"));

        BigDecimal bonus = bonusService.calcularBonus(funcionario);

        assertEquals(new BigDecimal("1000").setScale(1), bonus);
    }

}