public class Motorcycle extends Vehicle {

    public Motorcycle(String model) {
        super(model);
    }

    @Override
    String honk() {
        return "Motorcycle " + getModel() + " is honking";
    }

    @Override
    public String start() {
        return "Motorcycle " + getModel() + " is starting";
    }

    @Override
    public String stop() {
        return "Motorcycle " + getModel() + " is stopping";
    }
}
