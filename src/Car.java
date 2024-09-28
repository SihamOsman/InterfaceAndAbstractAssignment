public class Car extends Vehicle{
    @Override
    String honk() {
        return "Car " + getModel() + " is honking";
    }

    public Car(String model) {
        super(model);
    }

    @Override
    public String start() {
        return "Car " + getModel() + " is starting";
    }

    @Override
    public String stop() {
        return "Car " + getModel() + " is stopping";
    }

}
