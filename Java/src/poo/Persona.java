package src.poo;

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
}
