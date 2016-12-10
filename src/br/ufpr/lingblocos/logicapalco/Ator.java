/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

/**
 *    pub    public abstract void gire(Integer g);
lic abstract void gire(Integer g);

 * @author Lenovo
 */
public abstract class Ator {
    protected int x;
    protected int y;
    protected Desenhador desenhador;
    protected Palco palco;

    public Ator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void desenhar();
    public abstract boolean dentro(int x, int y);
    public abstract void redimensionaAtor(Integer rx, Integer ry);
    
     public abstract void gire(int g);
    

    public void setDesenhador(Desenhador desenhador) {
        this.desenhador = desenhador;
    }
    

    public void mover(Integer dx, Integer dy) {
        this.x += dx;
        this.y += dy;
        
        palco.desenhar();
    }

    public void setPalco(Palco palco) {
        this.palco = palco;
    }
}
