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
        this.notas.put(asignatura, new float[asignatura.getTrimestres()]);
        return this;
    }

    public Alumno setNota(Asignatura asignatura, int trimestre, float nota){
        this.notas.get(asignatura)[trimestre-1] = nota;
        return this;
    }

    public float media(Asignatura asignatura){
        float acc = 0.0f;
        for (int i = asignatura.getTrimestres(); i > 0; i--){
            acc += this.notas.get(asignatura)[i-1];
        }
        acc /= asignatura.getTrimestres();
        return acc;
    }

    public float nota(Asignatura asignatura, int trimestre){
        try{
            if (this.notas.get(asignatura)[trimestre-1] != 0.0f){
                return this.notas.get(asignatura)[trimestre-1];
            } else {
                return 0.0f;
            }
        } catch (Exception e) {
            return 0.0f;
        }
    }

    public boolean aprobada(Asignatura asignatura){
        if (this.media(asignatura) >= 5.0f){ //esto se queja no se mu bien por que pero no le gusta al java de los cojones
            return true;
        }
        return false;
    }
}
