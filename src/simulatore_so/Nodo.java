/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulatore_so;

/**
 *
 * @author eliuzhc
 */
public class Nodo {
    private Processo processo;
    private Nodo link;

    
   
    public Nodo(Processo processo) {
        this.processo = processo;
        this.link = null;
    }
    
    public void setLink(Nodo nodo){
        link=nodo;
    }

    public Processo getInfo() {
        return processo;
    }

    public Nodo getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Nodo{" + "processo=" + processo + ", link=" + link + '}';
    }
    Processo p= new Processo();
    Nodo nodo =new Nodo(p);
}
