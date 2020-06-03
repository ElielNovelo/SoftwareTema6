/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretema6;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ElielNoveloC
 */
public class tblUnpaso extends AbstractTableModel {
    
    private String[] columnas = {"n", "Xn", "Yn","F(Xn + Yn^2)"};
     private ArrayList<csUnpaso> lista =null;

    public tblUnpaso(ArrayList<csUnpaso> Resultado) {
        this.lista = Resultado;
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int i, int columna) {
        csUnpaso fila = this.lista.get(i);
        switch(columna)
        {
            case 0: return fila.getIteraciones();
            
            case 1: return fila.getXn();
            
            case 2: return fila.getYn();
            
            case 3: return fila.getFy();
        }
        return null;
    }
    
    @Override
     public boolean isCellEditable(int i, int i1) {
        return true;
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
}
