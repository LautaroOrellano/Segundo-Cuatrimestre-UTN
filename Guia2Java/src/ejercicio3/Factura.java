package ejercicio3;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {

    private UUID id;
    private double montoTotal;
    private LocalDateTime dateTime;
    private Cliente cliente;

    public Factura() {
        this.id = UUID.randomUUID();
    }

    public Factura(Cliente cliente, double montoTotal) {
        this.id = UUID.randomUUID();
        this.cliente = cliente;
        this.dateTime = LocalDateTime.now();
        this.montoTotal = montoTotal;
    }

    public UUID getId() {
        return id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double calcularMontoFinalConDescuento(double descuento){
        montoTotal = montoTotal - cliente.getDescuento();
        return montoTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", montoTotal=" + montoTotal +
                ", dateTime=" + dateTime +
                ", cliente=" + cliente +
                '}';
    }
}
