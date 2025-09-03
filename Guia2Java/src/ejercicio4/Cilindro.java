package ejercicio4;

public class Cilindro extends Circulo {

    private double altura = 1.0;

    public Cilindro() {
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double calcularVolumen(){return Math.PI * getRadio() * getRadio() * altura;}

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                "} " + super.toString();
    }
}
