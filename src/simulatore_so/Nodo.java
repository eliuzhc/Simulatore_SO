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
    Processo processo;
    Nodo link;
    
    public void Nodo(Processo processo){
        this.processo=processo;
        link=null;
    }
    
    public void setlink(Nodo nodo){
        this.setlink(nodo);
    }

    public Processo getProcesso() {
        return processo;
    }

    public Nodo getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Nodo{" + "processo=" + processo + ", link=" + link + '}';
    }
    
}
