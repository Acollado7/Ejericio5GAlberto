package paquetec;

public class MainOrdenado {
    public static void main(String[] args) {

        //Creamos un ejercito
        EjercitoOrdenado EjercitoDeTierra = new EjercitoOrdenado(1);
        EjercitoOrdenado ejercitoDeAire = new EjercitoOrdenado(2);
        EjercitoOrdenado ejercitoDelAgua = new EjercitoOrdenado(3);

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
        EjercitoDeTierra.enlistarSoldado(soldado);
        EjercitoDeTierra.enlistarSoldado(soldado2);
        EjercitoDeTierra.enlistarSoldado(soldado3);
        EjercitoDeTierra.enlistarSoldado(soldado10);

        ejercitoDeAire.enlistarSoldado(soldado4);
        ejercitoDeAire.enlistarSoldado(soldado5);
        ejercitoDeAire.enlistarSoldado(soldado6);

        ejercitoDelAgua.enlistarSoldado(soldado7);
        ejercitoDelAgua.enlistarSoldado(soldado8);
        ejercitoDelAgua.enlistarSoldado(soldado9);


        //Mostramos los soldados
        EjercitoDeTierra.mostrarSoldados();

        System.out.println("------------------------------------------------------------------------------------------");

        //Mostramos la cantidad de soldados
        System.out.println("La cantidad de soldados es: " + EjercitoDeTierra.cantidadSoldados());

        System.out.println("------------------------------------------------------------------------------------------");

        //Mostramos los soldados guardados en el arraylist
        System.out.println(EjercitoDeTierra.guardarSoldados());

        System.out.println("------------------------------------------------------------------------------------------");

        //Eliminamos un soldado
        EjercitoDeTierra.eliminarSoldado(10);
        System.out.println("-----------------------------Soldado Eliminado-------------------------");
        System.out.println("------------------------------------------------------------------------------------------");
        //Mostramos los soldados
        EjercitoDeTierra.mostrarSoldados();
        System.out.println("La cantidad de soldados es: " + EjercitoDeTierra.cantidadSoldados());

        System.out.println("------------------------------------------------------------------------------------------");

        ejercitoDeAire.mostrarSoldados();
        System.out.println("La cantidad de soldados es: " + ejercitoDeAire.cantidadSoldados());

        System.out.println("------------------------------------------------------------------------------------------");

        ejercitoDelAgua.mostrarSoldados();
        System.out.println("La cantidad de soldados es: " + ejercitoDelAgua.cantidadSoldados());

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("El soldado con el nif mas pequeño es: " + EjercitoDeTierra.buscarSoldado(1));

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("El soldado con el nif mas pequeño es: " + ejercitoDeAire.buscarSoldado(2));

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("El soldado con el nif mas pequeño es: " + ejercitoDelAgua.buscarSoldado(3));

        System.out.println("------------------------------------------------------------------------------------------");






    }
}
