/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.apresentacao.desktop.blocos.swing;

import br.ufpr.lingblocos.apresentacao.desktop.telablocos.swing.TelaBlocos;
import br.ufpr.lingblocos.logicablocos.Bloco;
import br.ufpr.lingblocos.util.IntegerTransformer;
import java.awt.Color;
import java.util.Iterator;

/**
 *
 * @author cassiele
 */
public class BlocoRedimensiona extends BlocoSimples implements BlocoComCampos {
    
    private Campos campos = new Campos(this);

    public BlocoRedimensiona(TelaBlocos tela, Bloco blocoLogica) {
        super(tela,"Redimensiona", Color.RED, blocoLogica );
        addCampos();
        
    }
    
     @Override
    public void addCampos() {
        BlocoCaixaTexto<Integer> caixa = new BlocoCaixaTexto("rx", "0", new IntegerTransformer());      
        campos.addOriginal(caixa);
        caixa.setBounds(50, 10, 20, 20);
        
        BlocoCaixaTexto<Integer> caixa2 = new BlocoCaixaTexto("ry", "0", new IntegerTransformer());      
        campos.addOriginal(caixa2);
        caixa2.setBounds(80, 10, 20, 20);

    }

    @Override
    public void removeCampo(Encaixavel campo) {
        campos.removeCampo(campo);
    }

    @Override
    public void trocaCampo(Encaixavel antigo, Encaixavel novo) {
        campos.trocaCampo(antigo, novo);
        
    }
    
     @Override
    public Iterator<Encaixavel> getCamposIterator() {
        return campos.getCamposIterator();
    }
    
    public Campos getCampos() {
        return campos;
    }
    
  
    
}
