package org.example.abstratFactory;

public class NfeVendaCamisa implements NFE{
    @Override
    public String emitir() {
        return "NFE referente a venda de uma camisa.";
    }
}
