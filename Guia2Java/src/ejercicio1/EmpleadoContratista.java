package ejercicio1;

public class EmpleadoContratista extends Empleado {

    private Double precioPorProyecto;
    private int horasTrabajadas;

    public Double getPrecioPorProyecto() {
        return precioPorProyecto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }


    public EmpleadoContratista (String nombre, Double tarifaHora, int horasTrabajadas, Double precioPorProyecto) {
        super (nombre, tarifaHora);
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorProyecto = precioPorProyecto;

    }

    @Override
    public Double calcularPago() {

        return (getSalario() * horasTrabajadas) + precioPorProyecto;
    }
}
