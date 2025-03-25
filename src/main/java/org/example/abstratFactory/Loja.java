package org.example.abstratFactory;

public class Loja{
    private RelatorioFaturamento relatorioFaturamento;
    private NFE nfe;

    public Loja(FabricaAbstrata fabricaAbstrata) {
        this.relatorioFaturamento = fabricaAbstrata.criarRelatorioFaturamento();
        this.nfe = fabricaAbstrata.criarNFE();
    }
    public String gerarRelatorioFaturamento(){
        return this.relatorioFaturamento.emitir();
    }
    public String gerarNFE(){
        return this.nfe.emitir();
    }
}
