package paqueteb;

import java.util.SortedMap;
import java.util.TreeMap;
public class PremiosLista {

    private SortedMap<String, Double> lista;

    public void ListaDePremios() {
        this.lista = new TreeMap<>();

        for (int i = 0; i < 10; i++) {

            lista.put(new Numeros().getNumero(), (double) new Premios().getPrecio());
        }

    }

    public SortedMap<String, Double> getLista() {
        return lista;
    }

    public double saberPremio(String key){





        return lista.get(key);
    }

    public void imprimirLista(){

        for (String key : lista.keySet()) {
            System.out.printf("Key %s -- Value %s %n",key , lista.get(key));
        }



    }

}
