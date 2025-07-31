package src.herencia;

public class Empleado extends Persona {
    
    //atributos
    private double salario;

    //Constructor
    public Empleado(String nombre, int edad, double salario){
        super(nombre,edad);
        this.salario = salario;
    }
    //Metodos de la clase Empleado
    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    //Metodo mostrar informacion
    @Override //Sobreescribiendo un metodo de la clase padre
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Salario: " + salario);
    }

}
