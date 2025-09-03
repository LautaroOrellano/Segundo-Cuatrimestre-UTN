package ejercicio4;

public class Cilindro extends Circulo {

    private double altura = 1.0;

    public Cilindro(double radio, double altura, String color) {
        super(radio, color);
        this.altura = altura;
    }

    public double calcularVolumen(){return Math.PI * getRadio() * getRadio() * altura;}


}
