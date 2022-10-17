public class Encapsulacion {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Manuel Brito");

        Estudiante edad = new Estudiante();
        edad.setEdad(43);

        Estudiante numero = new Estudiante();
        numero.setNumero("829-6511367");

        System.out.println(estudiante.getNombre());
        System.out.println(edad.getEdad());
        System.out.println(numero.getNumero());

    }
}
// Creacion de clase Estudiante
class Estudiante {
    private String nombre;
    private int edad;
    private String numero;

    public void setNombre(String valor) {
        this.nombre = valor;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNumero() {
        return this.numero;

    }

}