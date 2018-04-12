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
public class Lista {
    
 private Nodo head;
 private int elementi;
 
 
 public Lista() {
    head = null;
    elementi=0;
 }
 
 private Nodo getLinkPosizione(int posizione) {
    int n = 1;
    Nodo p = head;
    if (head==null)
     ;
    if ((posizione>elementi) || (posizione<1))
     System.out.println("Posizione errata");
    while ((p.getLink()!=null) && (n<posizione)) {
     p = p.getLink();
     n++;
    }
    return p;
}
 
   private Nodo creaNodo(Processo processo, Nodo link) {
   Nodo nodo=new Nodo(processo);
   nodo.setLink(link);
   return nodo;
 }

 public int getElementi() {
  return elementi;
 }

 public void inserisciInTesta(Processo processo) {
     Nodo p = creaNodo(processo, head);
     head = p;
     elementi++;
     Nodo p1= getLinkPosizione(elementi);
     p1.setLink(head);
     return;
 }
 
 public void inserisciInCoda(Processo processo) {
    if (head==null)
      inserisciInTesta(processo);
    else {    
      Nodo p = getLinkPosizione(elementi);
      p.setLink(creaNodo(processo, head));
      elementi++;
    return;
    }
   }
 
 public void inserisciInPosizione(Processo processo, int posizione){
       if (posizione<=1)
         inserisciInTesta(processo);
       else {
         if (elementi<posizione)
           inserisciInCoda(processo);
         else {
           Nodo p = getLinkPosizione(posizione-1);
           p.setLink(creaNodo(processo, p.getLink()));
           elementi++;
    }
  }
    return;
 } 
 
public void eliminaInTesta()  {
   if (head==null)
     System.out.println("Lista vuota");
     head=head.getLink();
     elementi--;
     return;
 }

 public Processo eliminaInCoda()  {
    if (head==null)
      System.out.println("Lista vuota");
    Nodo p1=getLinkPosizione(elementi);
    Nodo p=getLinkPosizione(elementi-1);
    p.setLink(head);
    elementi--;
    return p1.getInfo();
 }
 
 public void eliminaInPosizione(int posizione)  {
  if (posizione==1)
    eliminaInTesta();
  else
   if (posizione==elementi)
     eliminaInCoda();
   else {
     Nodo ps = getLinkPosizione(posizione);
     Nodo pp = getLinkPosizione(posizione-1);
     pp.setLink(ps.getLink());
     elementi--;
  }
  return;
 }
 
 private String visita(Nodo p) {
  if (p==head)
   return "";
  return p.getInfo().toString()+"\n"+visita(p.getLink());
 }
 
 public String elenco() {
  return visita(head.getLink());
 }
 
 public String toString() {
  Nodo p = head;
  String lista = new String("head->");
  if (p==null)
   return lista+"null";
  while (p!=null) {
   lista = lista+"["+p.getInfo().toString()+"|";
   if (p.getLink()==null)
    lista = lista+"null]";
   else
    lista = lista+"+]->";
    p = p.getLink();
  }
  return lista;
 }
}

