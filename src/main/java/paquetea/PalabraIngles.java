package paquetea;

import java.util.Comparator;
import java.util.Objects;

public class PalabraIngles implements Comparable<PalabraIngles> {

    private String texto;

    public PalabraIngles(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.texto);
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
        final PalabraIngles other = (PalabraIngles) obj;
        return Objects.equals(this.texto, other.texto);
    }

    @Override
    public String toString() {
        return "PalabraInglesa{" + "texto=" + texto + '}';
    }




    @Override
    public int compareTo(PalabraIngles o) {
        return this.texto.compareToIgnoreCase(o.getTexto());
    }


}
