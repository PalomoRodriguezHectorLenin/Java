package src.Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{
    protected int cilindrada;
    
    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Cilindrada: "+cilindrada);
    }

}