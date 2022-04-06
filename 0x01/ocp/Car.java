public class Car extends Vehicle implements IVehicleCar{

    private int seats;

    public Car(String color, String year, double engine, int i) {
        super(color, year, engine, 4);
        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        System.out.println("Criando um carro com Interface: "+ color + " " + engine);
        startVehicle();


    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando os motores com Interface");

    }
}
