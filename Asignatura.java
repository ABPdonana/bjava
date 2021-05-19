public class Asignatura {

    String nombre;
    int trimestres;

    public Asignatura(String nombre, int trimestres) {
        this.nombre = nombre;
        this.trimestres = trimestres;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTrimestres() {
        return this.trimestres;
    }

    public void setTrimestres(int trimestres) {
        this.trimestres = trimestres;
    }

}
