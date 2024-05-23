package padre;

class padre{
    //Atributos
    public String nombre;
    public String apellido;
    public int edad;
    //Constructor
    public padre(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //Metodo
    public void padre(){
        System.out.println("Nombre: "+ nombre + " " + apellido + "\t\tEdad: " + edad);
    }
}


class hijo extends padre{
    //Constructor
    public hijo(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }
    public void hijo(){
        System.out.println("Nombre: "+ nombre + " " + apellido + "\t\tEdad: " + edad);
    }
}

class nieto extends hijo{
    //Constructor
    public nieto(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }
    public void nieto(){
        System.out.println("Nombre: "+ nombre + " " + apellido + "\t\tEdad: " + edad);
    }
}


public class Main {
    public static void main(String[] args) {
        //objetos
        System.out.println("PADRE");
        padre padre1 = new padre("Luis", "Valladares", 50);
        padre1.padre();

        System.out.println("HIJO");
        hijo hijo1 = new hijo("Samuel", "Valladares",25);
        hijo1.hijo();

        System.out.println("Nieto");
        nieto nieto1 = new nieto("Javier", "Valladares",1);
        nieto1.nieto();
    }
}
