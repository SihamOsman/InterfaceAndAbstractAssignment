//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Car  honda = new Car("Acura");
      Motorcycle motorcycle =new Motorcycle("M1");
        System.out.println(honda.start());
        System.out.println(honda.honk());
        System.out.println(honda.stop());
        System.out.println(motorcycle.start());
        System.out.println(motorcycle.honk());
        System.out.println(motorcycle.stop());


    }
}