package org.example.abstratFactory;

public class FabricaVendaCamisa implements FabricaAbstrata {
    @Override
    public RelatorioFaturamento criarRelatorioFaturamento() {
        return new RelatorioFaturamentoVendaCamisa();
    }

    @Override
    public NFE criarNFE() {
        return new NfeVendaCamisa();
    }
}
