package src.herencia;

public class Main {
    public static void main(String[] args){
        //Objeto de la clase Persona
        Persona persona = new Persona("Yo", 22);
        Persona persona1 = new Persona("Alejandro", 28);
        //Objeto de la clase Empleado
        Empleado empleado1 = new Empleado("Javier", 20, 1500);

        //Utilizacion de los metodos del objeto Persona
        persona.mostrarInformacion();
        persona1.mostrarInformacion();
        //Utilizacion de los metodos del objeto Empleado
        empleado1.mostrarInformacion();

        //Cambiar nombre de la persona utilizando el setter
        persona.setNombre("Carlos");
        persona.setEdad(29);

        persona1.setNombre("Ana");
        persona1.setEdad(30);

        persona.mostrarInformacion();
        persona1.mostrarInformacion();
        //Cambiar datos del Empleado utilizando el setter
        empleado1.setSalario(1200);
        empleado1.mostrarInformacion();
    }
}
