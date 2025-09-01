public class ItemVenta {

    private int id;
    private String name;
    private int quantity;
    private double price;
    private double priceTotal;
    private static int contador = 0;

    public double calcularPrecioTotal(){

        priceTotal = price * quantity;

        return priceTotal;
    }

    public ItemVenta() {
        this.id = ++contador;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cant=" + quantity +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int cant) {
        this.quantity = cant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceTotal() {
        return priceTotal;
    }


}
