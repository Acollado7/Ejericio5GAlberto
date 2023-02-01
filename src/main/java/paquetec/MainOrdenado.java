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


        //Mostramos los soldados
        ejercito.mostrarSoldados();

        System.out.println("------------------------------------------------------------------------------------------");

        //Mostramos la cantidad de soldados
        System.out.println("La cantidad de soldados es: " + ejercito.cantidadSoldados());

        System.out.println("------------------------------------------------------------------------------------------");

        //Mostramos los soldados guardados en el arraylist
        System.out.println(ejercito.guardarSoldados());

        System.out.println("------------------------------------------------------------------------------------------");

        //Eliminamos un soldado
        ejercito.eliminarSoldado(10);
        System.out.println("-----------------------------Soldado Eliminado-------------------");
        System.out.println("------------------------------------------------------------------------------------------");
        //Mostramos los soldados
        ejercito.mostrarSoldados();
        System.out.println("La cantidad de soldados es: " + ejercito.cantidadSoldados());




    }
}
