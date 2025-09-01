public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private int precio;
    private int stock;

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Libro() {}

    public Libro(String titulo, String autor, int precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }

    public int venderCopias(int cantAVender) {

        if (stock < cantAVender) {
            System.out.println("No hay suficiente stock para esa cantidad de copias");
        } else {
            int stockFinal = stock - cantAVender;
            stock = stockFinal;
        }

        return stock;
    }

    public int incrementarCopias(int cantAIncrementar) {

        int stockFinal = 0;

        if (cantAIncrementar < 0) {
            System.out.println("La cantidad de copias a incrementar debe ser positiva");

        } else {
            stockFinal = cantAIncrementar + stock;
            stock = stockFinal;
        }


        return stock;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
