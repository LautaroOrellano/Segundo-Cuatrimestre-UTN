package ejercicio5;

public class Alumno extends Persona{

    private int añoIngreso;
    private int cuotaMensual;
    private String carrera;

    public Alumno (){

    }

    public Alumno(String dni, String nomre, String apellido, String email,
                  String direccion, int añoIngreso, int cuotaMensual, String carrera) {
        super(dni, nomre, apellido, email, direccion);
        this.añoIngreso = añoIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public int getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(int cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "añoIngreso=" + añoIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                "} " + super.toString();
    }
}
