package paquetec;

import java.util.*;

public class EjercitoOrdenado {
//En una estructura map, asocia a cada objeto de tipo Ejercito un identificador único.
// Se deben poder guardar Ejércitos con sus identificadores asociados, obtener un Ejercito
// según su identificador y obtener todos los Ejércitos contenidos en la estructura map.
    private SortedMap<Integer, Soldado> ejercito;
    private int identificador;
//Queremos que haya diferentes tipos de ejercito y separarlos por su identificador
    public EjercitoOrdenado(int identificador) {
        ejercito = new TreeMap<>();
        this.identificador = identificador;
    }


    public void enlistarSoldado(Soldado soldado){
        ejercito.put(identificador, soldado);
        identificador++;
    }

    public void mostrarSoldados(){
        for (Map.Entry<Integer, Soldado> entry : ejercito.entrySet()) {
            System.out.println("Identificador: " + entry.getKey() + " - " + entry.getValue());
        }
    }

    public int cantidadSoldados(){
        return ejercito.size();
    }

    public List<Soldado> guardarSoldados(){
        List<Soldado> soldados = new ArrayList<>();
        for (Map.Entry<Integer, Soldado> entry : ejercito.entrySet()) {
            soldados.add(entry.getValue());
        }
        return soldados;
    }

    public void eliminarSoldado(int identificador){
        ejercito.remove(identificador);
    }

    //Metodo Buscar Soldado
    public Soldado buscarSoldado(int identificador){
        return ejercito.get(identificador);
    }
}