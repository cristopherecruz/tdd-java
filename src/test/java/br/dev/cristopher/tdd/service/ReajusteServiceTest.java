package br.dev.cristopher.tdd.service;

import br.dev.cristopher.tdd.model.Desempenho;
import br.dev.cristopher.tdd.model.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {
    private ReajusteService reajusteService;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar() {
        this.reajusteService = new ReajusteService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    public void reajusteDeveriaSerTresPorcentoQuandoDesempenhoForRegular() {

        reajusteService.concederReajuste(funcionario, Desempenho.REGULAR);

        assertEquals(new BigDecimal("1030").setScale(1), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerTresPorcentoQuandoDesempenhoForBom() {

        reajusteService.concederReajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150").setScale(1), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerTresPorcentoQuandoDesempenhoForOtimo() {

        reajusteService.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200").setScale(1), funcionario.getSalario());
    }

}
