
package softwaretema6;

import java.util.ArrayList;


public class CtrlMetodos {
    public tblUnpaso Unpaso (double x, double h , int n){
        ArrayList<csUnpaso> lista = null;
        tblUnpaso tabla;
        int cont = 0;
        double xn = 1, ynAnterior = 0, fyAnterior = 1;
        lista = new ArrayList<csUnpaso> ();
            while (cont != n){
                csUnpaso fila = new csUnpaso();
                fila.setIteraciones(cont + 1);
                xn += h;
                fila.setXn(xn);
                fila.setYn(ynAnterior + (h*fyAnterior));
                ynAnterior = fila.getYn();
                
                fila.setFy(xn + (Math.pow(ynAnterior, 2)));
                
               
                fyAnterior = fila.getFy();
                lista.add(fila);
                cont++;
            }
            tabla = new tblUnpaso(lista);
            return tabla;
    }
}
