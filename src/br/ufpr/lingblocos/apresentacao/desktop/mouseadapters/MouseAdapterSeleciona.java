/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.apresentacao.desktop.mouseadapters;

import br.ufpr.lingblocos.apresentacao.desktop.teladesenho.TelaDesenho;
import br.ufpr.lingblocos.logicapalco.Palco;
import java.awt.event.MouseEvent;

/**
 *
 * @author Lenovo
 */
public class MouseAdapterSeleciona extends MouseAdapterFigura{

    private Palco palco;

    public MouseAdapterSeleciona(TelaDesenho telaDesenho, Palco palco) {
        super(telaDesenho);
        this.palco=palco;
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        palco.selecionarAtor(e.getX(),e.getY() );
    }
    
}
