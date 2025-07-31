package src.Polimorfismo;

public class Principal {
    public static void main(String[] args){
        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GH67", "Ferrari","A89");
        misVehiculos[1] = new VehiculoTurismo("78HJ", "Audi", "P14", 4);
        misVehiculos[2] = new VehiculoDeportivo("45GH", "Toyota", "KJ8", 500);
        misVehiculos[3] = new VehiculoFurgoneta("J18", "Toyota", "J9", 2000);

        for(Vehiculo vehiculos: misVehiculos){
            vehiculos.mostrarDatos();
            System.out.println("");
        }
    }
}
