import Classes.Vehicles;
import enums.Model;

public class Main {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles("2024", "Yamaha");

        System.out.println(vehicles);

        Model model = Model.M2008;
        Model model2 = Model.valueOf("M2008");
    }
}