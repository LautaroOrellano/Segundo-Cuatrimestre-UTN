package ejercicio1;

public abstract class Empleado {

    private String nombre;
    private Double salario;

    public Empleado(String nombre, Double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }

    public Double getSalario(){
        return salario;
    }

    public abstract Double calcularPago();
}
