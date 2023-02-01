package paquetec;

import java.util.*;

public class EjercitoOrdenado {

    private Map<Integer, Soldado> ejercito;

    public EjercitoOrdenado(int capacidad) {
        ejercito = new TreeMap<Integer, Soldado>();
    }

    public void enlistarSoldado(Soldado soldado) {
        ejercito.put(soldado.getNif(), soldado);
    }

    public Soldado obtenerSoldado(int nif) {
        return ejercito.get(nif);
    }

    public Collection<Soldado> obtenerSoldados() {
        return ejercito.values();
    }

    public void mostrarSoldados() {
        for (Soldado soldado : ejercito.values()) {
            System.out.println(soldado);
        }
    }

    //metodo que nos muestre la cantidad de soldados que hay en el ejercito
    public int cantidadSoldados(){
        return ejercito.size();
    }

    //metodo para guardar los soldados

    public ArrayList<Soldado> guardarSoldados(){
        ArrayList<Soldado> soldados = new ArrayList<Soldado>();
        for (Soldado soldado : ejercito.values()) {
            soldados.add(soldado);
        }
        return soldados;
    }

    //metodo eliminar soldado
    public void eliminarSoldado(int nif){
        ejercito.remove(nif);
    }



}
