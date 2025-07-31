package src.herencia;

public class Persona {
    //Clase de tipo pojo
    //Atributos
    private String nombre; //modificador de acceso private, permite que el atributo pueda ser accedido solamente en la clase donde se ha declarado
    private int edad; 

    //Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodos Getter and Setter
    //Metodos get, sirven para obtener la informacion
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    //Metodo para mostrar la informacino de la persona
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    /*
    Modificadores de acceso
    Public: Se utiliza para que los metodos sean accesibles desde cualquier
           parte
    Private: Solo los metodos sean accesibles desde la misma clase
    Protected: Es accesible desde el paquete y desde las subclases
     */
}
