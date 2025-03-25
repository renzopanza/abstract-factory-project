package org.example.abstratFactory;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class LojaTest {
    @Test
    void deveGerarRelatorioVendaCalca(){
        FabricaAbstrata fabricaAbstrata = new FabricaVendaCalca();
        Loja loja = new Loja(fabricaAbstrata);
        assertEquals("Relatorio de faturamento referente a venda de uma calça", loja.gerarRelatorioFaturamento());
    }

    @Test
    void deveGerarNfeVendaCalca(){
        FabricaAbstrata fabricaAbstrata = new FabricaVendaCalca();
        Loja loja = new Loja(fabricaAbstrata);
        assertEquals("NFE referente a venda de uma calça.", loja.gerarNFE());
    }

    @Test
    void deveGerarRelatorioVendaCamisa(){
        FabricaAbstrata fabricaAbstrata = new FabricaVendaCamisa();
        Loja loja = new Loja(fabricaAbstrata);
        assertEquals("Relatorio de faturamento referente a venda de camisa.", loja.gerarRelatorioFaturamento());
    }

    @Test
    void deveGerarNfeVendaCamisa(){
        FabricaAbstrata fabricaAbstrata = new FabricaVendaCamisa();
        Loja loja = new Loja(fabricaAbstrata);
        assertEquals("NFE referente a venda de uma camisa.", loja.gerarNFE());
    }

    @Test
    void deveGerarRelatorioVendaCasaco(){
        FabricaAbstrata fabricaAbstrata = new FabricaVendaCasaco();
        Loja loja = new Loja(fabricaAbstrata);
        assertEquals("Relatorio de faturamento referente a venda de um casaco.", loja.gerarRelatorioFaturamento());
    }
    @Test
    void deveGerarNfeVendaCasaco(){
        FabricaAbstrata fabricaAbstrata = new FabricaVendaCasaco();
        Loja loja = new Loja(fabricaAbstrata);
        assertEquals("NFE referente a venda de um casaco.", loja.gerarNFE());
    }
}