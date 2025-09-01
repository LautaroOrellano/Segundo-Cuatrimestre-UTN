public class CuentaBancaria {

    private int id;
    private String nombre;
    private Double deposito;
    private Double debito;
    private Double saldo;
    private Double nuevoSaldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }

    public Double getDebito() {
        return debito;
    }

    public void setDebito(Double debito) {
        this.debito = debito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public CuentaBancaria(){}

    public Double creditoACuenta() {
        nuevoSaldo = saldo + deposito;
        System.out.println("Su saldo es de: " + nuevoSaldo);

        return nuevoSaldo;
    }

    public Double debitoDeCuenta(Double saldo) {


        if (debito > saldo) {
            System.out.println("No dispone con suficiente saldo para realizar esa operacion, consulte su saldo.");
        } else {
            System.out.println("Compra realizada correctamente");
            nuevoSaldo = saldo - debito;
        }

        System.out.println("Su saldo es de: " + nuevoSaldo);

        return nuevoSaldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
