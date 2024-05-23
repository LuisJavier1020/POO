package POO;

class clase1 {

    //Atributos
    public String nombre;
    public String apellido;

    //Constructor
    public clase1(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Metodo
    public void mostrar() {
        System.out.println("Nombre: " + nombre + " \tApellido: " + apellido);
    }

}

public class Main {
    public static void main(String[] args) {
        //objetos
        clase1 persona1 = new clase1("Luis","Valladares");
        clase1 persona2 = new clase1("Heydi","Zambrano");
        clase1 persona3 = new clase1("Samuel","Barreros");

        //llamar metodo
        persona1.mostrar();
        persona2.mostrar();
        persona3.mostrar();

    }
}