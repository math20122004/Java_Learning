package Produtos;

public class Cultura implements Tributo{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cultura(String name, double price){
        this.name = name;
        this.price = price;
    };

    @Override
    public void calcularImposto() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        
        System.out.printf("Nome: %s\nPreço: %.2f%nTributo: R$ %.2f%n \n", this.name, this.price, this.price * 0.04);
    }
}
