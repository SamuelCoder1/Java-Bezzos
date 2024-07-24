package Classes;

import Interfaces.VehiclesActions;

public class Car extends Vehicles implements VehiclesActions {
    private Boolean window;

    @Override
    public void move(){
        System.out.println("I'm moving with four wheels");
    }

    //Constructor
    public Car(){}

    public Car(String model, String brand, Boolean window){
        super(model, brand);
        this.window = window;
    }

    //Getter
    public Boolean getWindow(){
        return this.window;
    }

    //Seeter{
    public void setWindow(Boolean window) {
        this.window = window;
    }

    //toString
    @Override
    public String toString() {
        return "Car: " +
                "Model: " + getModel() +
                "Brand: " + getBrand() +
                "Window: " + this.window;
    }

    @Override
    public void honk(){
        System.out.println("Beepppp");
    }

    @Override
    public void playMusic(String song){
        System.out.printf("Playing now (%s)",song);
    }
}
