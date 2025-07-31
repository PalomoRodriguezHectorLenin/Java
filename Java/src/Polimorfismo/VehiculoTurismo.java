package src.Polimorfismo;

public class VehiculoTurismo extends Vehiculo {
    protected int numeroPuertas;
    
    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas){
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumPuertas(){
        return numeroPuertas;
    }
    public void setNumPuertas(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Numero de puertas: "+numeroPuertas);
    }
}
