public class Principal {
    public static void main(String[] args) {
        Asignatura ingles = new Asignatura("ingles", 3);
        Asignatura mates = new Asignatura("Matematicas", 2);
        Alumno juan = new Alumno("Juan Perez").matricular(ingles).matricular(mates);
        juan.setNota(ingles, 1, 4.0f).setNota(ingles, 2, 6.0f).setNota(ingles, 3, 8.0f);
        Alumno antonio = new Alumno("Antonio Garcia").matricular(mates);
        antonio.setNota(mates, 1, 2.5f);

        System.out.println(juan.media(ingles));
        System.out.println(antonio.nota(mates, 2));
        System.out.println(antonio.nota(mates, 1));
        System.out.println(antonio.media(mates)); //no va
        System.out.println(juan.aprobada(ingles));
    }
}
