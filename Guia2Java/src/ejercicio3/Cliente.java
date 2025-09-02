package ejercicio3;

import java.util.UUID;

public class Cliente {

    private UUID id;
    private String name;
    private String email;
    private double descuento;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDescuento() {
        return descuento;
    }

    public Cliente() {
        this.id = UUID.randomUUID();

    }

    public Cliente(String name, String email, double descuento) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.descuento = descuento;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "UUID=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                '}';
    }


}
