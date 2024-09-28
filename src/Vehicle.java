public abstract class Vehicle implements Drivable{
    private String model;
    abstract String honk ();
    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

