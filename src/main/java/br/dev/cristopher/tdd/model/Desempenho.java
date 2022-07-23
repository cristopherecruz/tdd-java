package br.dev.cristopher.tdd.model;

import java.math.BigDecimal;

public enum Desempenho {
    BOM(new BigDecimal("0.15")),
    OTIMO(new BigDecimal("0.20")),
    REGULAR(new BigDecimal("0.03"));
    private final BigDecimal reajuste;
    Desempenho(BigDecimal reajuste) {
        this.reajuste = reajuste;
    }
    public BigDecimal getReajuste() {
        return reajuste;
    }

}
