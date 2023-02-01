package paquetea;

import java.util.*;

public class Traductor {
    /*Aplica lo estudiado realizando un "Traductor" de palabras. Para ello, el traductor se crea usando dos
     objetos de tipo String, de forma que la clave es una palabra en el idioma que tú elijas y el valor es
     la traducción española. Es indispensable que las palabras extranjeras estén ordenadas alfabéticamente.

Inicialmente el traductor se crea vacío, sin registros. Existirá un método que servirá para guardar una
entrada y recibirá dos palabras (palabraExtranjera, palabraEspañol) para ir guardando traducciones. Se
deben poder borrar entradas y modificar entradas ya creadas, así como realizar la traducción de una palabra dada.
También debe haber dos métodos: una para crear una lista con las palabras no españolas que hay en el traductor y
otro para obtener las palabras en español.

Realiza una clase conteniendo el main() y 10 registros en tu traductor. Prueba los métodos realizados.
*/

   //Usamos Map para guardar las palabras
    private SortedMap<String, String> traductor;

    //Método para añadir palabras al traductor


    public Traductor() {
        this.traductor = new TreeMap<>();
    }

    public SortedMap<String, String> getPalabras() {
        return traductor;
    }

    public void setPalabras(SortedMap<String, String> palabras) {
        this.traductor = palabras;
    }

    @Override
    public String toString() {
        return "Traductor{" + "palabras=" + traductor + '}';
    }

    public void anadirPalabra(String key,String value){



        traductor.put(key, value);


    }

    //Metodo imprimir palabras

    public void imprimirPalabras(){
        for (Map.Entry<String, String> entry : traductor.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public ArrayList palabrasInglesas(){
        ArrayList<String> palabrasInglesas = new ArrayList<>();
        for (Map.Entry<String, String> entry : traductor.entrySet()) {
            palabrasInglesas.add(entry.getKey());
        }
        return palabrasInglesas;
    }

    public ArrayList palabrasEspanolas(){
        ArrayList<String> palabrasEspanolas = new ArrayList<>();
        for (Map.Entry<String, String> entry : traductor.entrySet()) {
            palabrasEspanolas.add(entry.getValue());
        }
        return palabrasEspanolas;
    }

    //Metodo borrar palabra

    public void borrarPalabra(String key){
        traductor.remove(key);
    }

    //Metodo modificar palabra

    public void modificarPalabra(String key, String value){
        traductor.replace(key, value);
    }

    public String traducir(String key){




        return traductor.get(key);


    }


}
