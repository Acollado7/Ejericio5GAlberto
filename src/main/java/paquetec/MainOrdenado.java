package paquetec;

public class MainOrdenado {
    public static void main(String[] args) {

        //Creamos un ejercito
        EjercitoOrdenado ejercito = new EjercitoOrdenado(10);

        //Creamos un soldado
        Soldado soldado = new Soldado("Pepe", "Perez", "Garcia", 20);
        Soldado soldado2 = new Soldado("Juan", "Perez", "Garcia", 20);
        Soldado soldado3 = new Soldado("Jose", "Perez", "Garcia", 20);
        Soldado soldado4 = new Soldado("Diego", "Perez", "Garcia", 20);
        Soldado soldado5 = new Soldado("Paco", "Perez", "Garcia", 20);
        Soldado soldado6 = new Soldado("Manuel", "Perez", "Garcia", 20);
        Soldado soldado7 = new Soldado("Ramon", "Perez", "Garcia", 20);
        Soldado soldado8 = new Soldado("Luis", "Perez", "Garcia", 20);
        Soldado soldado9 = new Soldado("Antonio", "Perez", "Garcia", 20);
        Soldado soldado10 = new Soldado("Pedro", "Perez", "Garcia", 20);

        //Añadimos el soldado al ejercito
        ejercito.enlistarSoldado(soldado);
        ejercito.enlistarSoldado(soldado2);
        ejercito.enlistarSoldado(soldado3);
        ejercito.enlistarSoldado(soldado4);
        ejercito.enlistarSoldado(soldado5);
        ejercito.enlistarSoldado(soldado6);
        ejercito.enlistarSoldado(soldado7);
        ejercito.enlistarSoldado(soldado8);
        ejercito.enlistarSoldado(soldado9);
        ejercito.enlistarSoldado(soldado10);

        //Mostramos el numero de soldados
        System.out.println("El numero de soldados es: " + ejercito.getNumeroSoldados());

        //Mostramos si el ejercito esta vacio
        System.out.println("El ejercito esta vacio: " + ejercito.noHaySoldados());

        //Mostramos si el soldado esta en el ejercito
        System.out.println("El soldado esta en el ejercito: " + ejercito.soldadoEstaEnEjercito(soldado));

        //Mostramos los soldados
        System.out.println("Los soldados son: " + ejercito.sacarSoldados());

        //Desmatriculamos al soldado
        ejercito.desmatricularSoldado(soldado);

        //Mostramos los soldados
        System.out.println("Los soldados son: " + ejercito.sacarSoldados());

        //Mostramos el numero de soldados
        System.out.println("El numero de soldados es: " + ejercito.getNumeroSoldados());
    }
}
