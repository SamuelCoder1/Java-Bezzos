package Classes;

public class Motorcycle extends Vehicles{
    private Boolean chain;

    @Override
    public void move(){
        System.out.println("I'm moving with two wheels");
    }

    //Constructor

    public Motorcycle(){}

    public Motorcycle(String model, String brand, Boolean chain){
        super(model, brand);
        this.chain = chain;
    }

    //Getter
    public Boolean getChain(){
        return this.chain;
    }

    //Seeter{
    public void setChain(Boolean chain) {
        this.chain = chain;
    }

    //toString

    @Override
    public String toString() {
        return "Motorcycle: " +
                "Model: " + getModel() +
                "Brand: " + getBrand() +
                "Chain: " + this.chain;
    }

    @Override
    public void honk(){
        System.out.println("Beepppp");
    }

}
