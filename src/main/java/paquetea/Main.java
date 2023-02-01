package paquetea;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creamos 10 palbras en ingles y español

        Traductor traductor = new Traductor();

        PalabraEspanol palabraEspanol1 = new PalabraEspanol("Hola");
        PalabraIngles palabraInglesa1 = new PalabraIngles("Hello");

        PalabraEspanol palabraEspanol2 = new PalabraEspanol("Avion");
        PalabraIngles palabraInglesa2 = new PalabraIngles("Plane");

        PalabraEspanol palabraEspanol3 = new PalabraEspanol("Playa");
        PalabraIngles palabraInglesa3 = new PalabraIngles("Beach");

        PalabraEspanol palabraEspanol4 = new PalabraEspanol("Adios");
        PalabraIngles palabraInglesa4 = new PalabraIngles("Goodbye");

        PalabraEspanol palabraEspanol5 = new PalabraEspanol("Perro");
        PalabraIngles palabraInglesa5 = new PalabraIngles("Dog");

        PalabraEspanol palabraEspanol6 = new PalabraEspanol("Gato");
        PalabraIngles palabraInglesa6 = new PalabraIngles("Cat");

        PalabraEspanol palabraEspanol7 = new PalabraEspanol("Escuela");
        PalabraIngles palabraInglesa7 = new PalabraIngles("School");

        PalabraEspanol palabraEspanol8 = new PalabraEspanol("Mapa");
        PalabraIngles palabraInglesa8 = new PalabraIngles("Map");

        PalabraEspanol palabraEspanol9 = new PalabraEspanol("Raton");
        PalabraIngles palabraInglesa9 = new PalabraIngles("Mouse");

        PalabraEspanol palabraEspanol10 = new PalabraEspanol("Teclado");
        PalabraIngles palabraInglesa10 = new PalabraIngles("Keyboard");


        traductor.anadirPalabra(palabraInglesa1.getTexto(),palabraEspanol1.getTexto());
        traductor.anadirPalabra(palabraInglesa2.getTexto(),palabraEspanol2.getTexto());
        traductor.anadirPalabra(palabraInglesa3.getTexto(),palabraEspanol3.getTexto());
        traductor.anadirPalabra(palabraInglesa4.getTexto(),palabraEspanol4.getTexto());
        traductor.anadirPalabra(palabraInglesa5.getTexto(),palabraEspanol5.getTexto());
        traductor.anadirPalabra(palabraInglesa6.getTexto(),palabraEspanol6.getTexto());
        traductor.anadirPalabra(palabraInglesa7.getTexto(),palabraEspanol7.getTexto());
        traductor.anadirPalabra(palabraInglesa8.getTexto(),palabraEspanol8.getTexto());
        traductor.anadirPalabra(palabraInglesa9.getTexto(),palabraEspanol9.getTexto());
        traductor.anadirPalabra(palabraInglesa10.getTexto(),palabraEspanol10.getTexto());

        System.out.println("------------------------------------------------------------------------------------");

        traductor.imprimirPalabras();

        System.out.println("------------------------------------------------------------------------------------");

        ArrayList<String> espaniolas= traductor.palabrasEspanolas();
        ArrayList<String> inglesas= traductor.palabrasInglesas();

        System.out.println("Palabras en español: ");

        for (String palabra : espaniolas) {
            System.out.println(palabra);
        }

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("Palabras en ingles: ");

        for (String palabra : inglesas) {
            System.out.println(palabra);
        }

        //usamos el metodo para traducir palabras
        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("Traduccion de la palabra 'Hello': "+traductor.traducir("Hello"));
        System.out.println("Traduccion de la palabra 'School': "+traductor.traducir("School"));
        System.out.println("Traduccion de la palabra 'Cat': "+traductor.traducir("Cat"));

        System.out.println("------------------------------------------------------------------------------------");

        //Usamos el metodo para borrar palabras

        System.out.println("Borramos la palabra 'Hello' y 'School'");
        traductor.borrarPalabra("Hello");
        traductor.borrarPalabra("School");

        System.out.println("------------------------------------------------------------------------------------");

        traductor.imprimirPalabras();

        System.out.println("------------------------------------------------------------------------------------");

        //usamos el metodo para modificar palabras

        System.out.println("Modificamos la palabra 'Cat' por 'Dog'");
        traductor.modificarPalabra("Cat","Dog");

        System.out.println("------------------------------------------------------------------------------------");

        traductor.imprimirPalabras();

        System.out.println("------------------------------------------------------------------------------------");









    }
}
