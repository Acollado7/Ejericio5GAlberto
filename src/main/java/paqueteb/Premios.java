package paqueteb;

public class Premios {

    private int premio;

    public Premios(){
        this.premio = (int) (Math.random() * 1000000);
    }

    public int getPrecio() {
        return premio;
    }

    public void setPrecio(int premio) {
        this.premio = premio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.premio) ^ (Double.doubleToLongBits(this.premio) >>> 32));
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
        final Premios other = (Premios) obj;
        return Double.doubleToLongBits(this.premio) == Double.doubleToLongBits(other.premio);
    }

    @Override
    public String toString() {
        return "Premio{" + "precio=" + premio + '}';
    }
}
