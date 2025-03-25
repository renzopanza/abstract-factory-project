package org.example.abstratFactory;

public class FabricaVendaCasaco implements FabricaAbstrata{
    @Override
    public RelatorioFaturamento criarRelatorioFaturamento() {
        return new RelatorioFaturamentoVendaCasaco();
    }

    @Override
    public NFE criarNFE() {
        return new NfeVendaCasaco();
    }
}
