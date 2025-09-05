package ejercicio5;

public class Staff extends Persona {

    private double salario;
    private String Turno;

    public Staff() {

    }

    public Staff(String dni, String nomre, String apellido,
                 String email, String direccion, double salario, String turno) {
        super(dni, nomre, apellido, email, direccion);
        this.salario = salario;
        Turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String turno) {
        Turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salario=" + salario +
                ", Turno='" + Turno + '\'' +
                "} " + super.toString();
    }
}
