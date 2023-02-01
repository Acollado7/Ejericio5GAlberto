package paqueteb;

import java.util.Objects;

public class Numeros {
    /*Implementa en una estructura de tipo map un sistema de almacenamiento de números de décimos de lotería nacional y su premio asociado.
Inserta en la estructura 1000 registros, inventando los números de los décimos y el premio asociado.
Ten en cuenta que el número de décimo debe contemplar ceros a la izquierda (09876, 00234, ...).

La aplicación debe ofrecer al usuario la posibilidad de consultar por número de décimo el premio obtenido.*/

    private String numero;
    private static int n = 1;


    public Numeros() {
        if (n < 10) {
            this.numero = "000" + String.valueOf(n);
        } else if (n >= 10 && n < 100) {
            this.numero = "00" + String.valueOf(n);
        } else if (n >= 100 && n < 1000) {
            this.numero = "0" + String.valueOf(n);
        } else {
            this.numero = String.valueOf(n);
        }
        n++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numeros{" + "numero=" + numero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Numeros other = (Numeros) obj;
        return Objects.equals(this.numero, other.numero);
    }

}
