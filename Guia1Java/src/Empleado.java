public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private Double salario;

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Double getSalario() {
        return salario;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Empleado() {}

    public Empleado(String nombre, String apellido, String dni, Double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    public Double calcularSalarioAnual(Double salario) {
        Double salarioAnual = (Double) salario * 12;

        return salarioAnual;
    }

    public Double aumentoSalarioXPorcentaje(Double salario, Double porcentaje) {
        double porcentajeDelSalario =  (salario * porcentaje) / 100;
        double salarioAumentado = salario + porcentajeDelSalario;

        return salarioAumentado;
    }

    @Override
    public String toString() {
        return "Datos Nuevo Empleado " + nombre + " {" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}
