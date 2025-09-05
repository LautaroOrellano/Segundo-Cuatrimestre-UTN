package ejercicio4;

public class Cilindro extends Circulo {

    private double altura = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    @Override
    public double calcularAreaCirculo() {
        double areaBase = super.calcularAreaCirculo();
        return 2 * Math.PI * getRadio() * altura + 2 * areaBase;
    }

    public double calcularVolumen(){
        double areaBase = super.calcularAreaCirculo();
        return areaBase * altura;
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de " + super.toString() + " altura=" + altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
