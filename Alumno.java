public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (numeroMatricula.length() < 4){
            System.out.println("ERROR. el numero de matricula introducido es demasiado corto");
        }
        if (nombre.length() < 3){
            System.out.println("ERROR. el nombre introducido es demasiado corto");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        int nom = 3;
        int num = 4;
        if (numeroMatricula.length() < 4){
            num = numeroMatricula.length();
        }
        if (nombre.length() < 3) {
            nom = nombre.length();
        }
        return nombre.substring(0, nom) + numeroMatricula.substring(0, num);
    }
}
