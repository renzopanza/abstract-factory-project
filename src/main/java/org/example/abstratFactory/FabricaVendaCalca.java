package org.example.abstratFactory;

public class FabricaVendaCalca implements FabricaAbstrata{
    @Override
    public RelatorioFaturamento criarRelatorioFaturamento() {
        return new RelatorioFaturamentoVendaCalca();
    }

    @Override
    public NFE criarNFE() {
        return new NfeVendaCalca();
    }
}
