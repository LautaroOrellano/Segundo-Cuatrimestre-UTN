package ejercicio1;

public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, Double salario) {
        super(nombre, salario);
    }

    @Override
    public Double calcularPago(){
        return getSalario();
    }
}
