package src.Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
    protected int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga){
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga(){
        return carga;
    }
    public void setCarga(int carga){
        this.carga = carga;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Carga: "+carga);
    }

}
