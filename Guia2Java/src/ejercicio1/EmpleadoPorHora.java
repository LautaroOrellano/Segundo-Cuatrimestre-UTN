package ejercicio1;

public class EmpleadoPorHora extends Empleado {

    private int horasTrabajadas;


    public EmpleadoPorHora (String nombre, Double salarioPorHora, int horasTrabajadas) {
        super (nombre, salarioPorHora);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public Double calcularPago() {
        return (horasTrabajadas * getSalario());
    }
}
