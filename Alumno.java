import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alumno{

    String nombre;
    private List<Asignatura> matriculado = new ArrayList<>();
    private Map<Asignatura, float[]> notas = new HashMap<>();

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno matricular(Asignatura asignatura){
        this.matriculado.add(asignatura);
        notas.put(asignatura, new float[asignatura.getTrimestres()]);
        return this;
    }

    public Alumno setNota(Asignatura asignatura, int trimestre, float nota){
        notas.get(asignatura)[trimestre] = nota;
        return this;
    }


}
