package practica5;

import java.util.ArrayList;

public class MemoriaDinamica {
    ArrayList<Integer> memoria = new ArrayList<>();
    int contador;

    public MemoriaDinamica() {
        contador = 0;
    }

    public void agregar(int valor) {
        memoria.add(valor);
        contador++;
    }

    public boolean eliminar() {
        if (contador > 0) {
            memoria.remove(--contador); 
            return true;
        }
        return false;
    }

    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < contador; i++) { 
            System.out.print(memoria.get(i) + (i < contador - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        MemoriaDinamica m = new MemoriaDinamica();
        m.agregar(10);
        m.agregar(20);
        m.agregar(30);
        m.mostrar(); 
        m.eliminar();
        m.mostrar();  
    }
}
