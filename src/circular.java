
public class circular {
    
    class Nodo {
        int info;
        Nodo ant,sig;
    }
    
    private Nodo raiz;
    
    public circular () {
        raiz=null;
    }
              
    public void insertarPrimero(int x) {
        Nodo nuevo=new Nodo();
        nuevo.info=x;
        if (raiz==null) {
            nuevo.sig=nuevo;
            nuevo.ant=nuevo;            
            raiz=nuevo;
        } else {
            Nodo ultimo=raiz.ant;
            nuevo.sig=raiz;
            nuevo.ant=ultimo;
            raiz.ant=nuevo;
            ultimo.sig=nuevo;
            raiz=nuevo;
        }
    }
    
    public void insertarUltimo(int x) {
        Nodo nuevo=new Nodo();
        nuevo.info=x;
        if (raiz==null) {
            nuevo.sig=nuevo;
            nuevo.ant=nuevo;            
            raiz=nuevo;
        } else {
            Nodo ultimo=raiz.ant;
            nuevo.sig=raiz;
            nuevo.ant=ultimo;
            raiz.ant=nuevo;
            ultimo.sig=nuevo;
        }
    }    
    
  
    public static void main(String[] ar) {
    }
}

