package paquetec;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;public class EjercitoOrdenado {
    //Crea una clase EjercitoOrdenado donde haya la misma funcionalidad pero hay que
    // tener en cuenta que en este caso no hay duplicados y los soldados están ordenados según su nif.

    private SortedSet<Soldado> soldados;

    /*En una estructura map, asocia a cada objeto de tipo Ejercito un
    identificador único. Se deben poder guardar Ejércitos con sus identificadores
    asociados, obtener un Ejercito según su nombre y obtener todos los Ejércitos
    contenidos en la estructura map.
     */
    public EjercitoOrdenado(int numeroSoldados) {
        this.soldados = new TreeSet<>();
    }

    public Set<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(SortedSet<Soldado> soldados) {
        this.soldados = soldados;
    }
    public int getNumeroSoldados() {
        return soldados.size();
    }

    public void enlistarSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public boolean noHaySoldados() {
        return soldados.isEmpty();
    }

    public boolean soldadoEstaEnEjercito(Soldado soldado) {
        if (soldados.contains(soldado)) {
            return true;

        } else {
            return false;
        }

    }

    public Set<Soldado> sacarSoldados() {
        return soldados;
    }

    public void desmatricularSoldado(Soldado soldado) {
        soldados.remove(soldado);
    }




}
