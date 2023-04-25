package StramAPI;

public class Game {
    public String name;
    public String develper;
    public String publisher;
    public String engine;
    public double price;

    public Game(String name, String develper, String publisher, String engine, double price) {
        this.name = name;
        this.develper = develper;
        this.publisher = publisher;
        this.engine = engine;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDevelper() {
        return develper;
    }

    public void setDevelper(String develper) {
        this.develper = develper;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", develper='" + develper + '\'' +
                ", publisher='" + publisher + '\'' +
                ", engine='" + engine + '\'' +
                ", price=" + price +
                '}';
    }
}
