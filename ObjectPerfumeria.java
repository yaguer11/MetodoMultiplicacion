/*Clase del objeto perfumería. Cuenta con cuatro atributos nombre, id, cantidad y precio. Para cada atributo hay un método get para acceder y un método set para modificarlos*/

public class ObjectPerfumeria {
    private String name;
    private int id;
    private int quantity;
    private double price;

    public ObjectPerfumeria(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}