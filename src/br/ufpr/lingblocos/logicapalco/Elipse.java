/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

/**
 *
 * @author Lenovo
 */
public class Elipse extends Ator{
    
    int largura;
    int altura;
    int direcao;
    
    public Elipse(int x, int y, int largura, int altura) {
        super(x, y);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        desenhador.desenhaElipse(x,y,largura,altura);
    }

    @Override
    public boolean dentro(int x, int y) {
        return true;
    }



    @Override
    public void redimensionaAtor(Integer rx, Integer ry) {
        this.largura += rx;
        this.altura += ry;
    }

    @Override
    public void gire(int g) {
      
        //--desenhador.desenhaElipse(x,y,largura,altura, g);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
