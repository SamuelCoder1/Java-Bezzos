package Classes;

import Interfaces.VehiclesActions;

public class Vehicles extends AbstractVehicles{
    //Attribute

    private String model;
    private String brand;

    //Constructor
    //Empty
    public Vehicles(){}
    //All
    public Vehicles(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    //Methods
    public void move(){
        System.out.println("I'm class father");
    }

    //Getter
    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    //Setter

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //toString -> Java
    @Override
    public String toString() {
        return "Model: "+ this.getModel() + " and Brand: "+ this.getBrand();
    }
}
