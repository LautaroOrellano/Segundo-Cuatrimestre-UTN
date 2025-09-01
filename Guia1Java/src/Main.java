import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ejercicio1
        /**
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Carlos", "Gutiérrez", "23456345",25000.0);
        Empleado empleado3 = new Empleado("Ana", "Sanchez", "34234123",27500.0);

        String datosEmpleado2 = empleado2.toString();
        String datosEmpleado3 = empleado3.toString();

        System.out.println(datosEmpleado2);
        System.out.println(datosEmpleado3);

        Double aumentoSalarioEmpleado2 = empleado2.aumentoSalarioXPorcentaje(empleado2.getSalario(), 15.0);
        System.out.println("El nuevo salario con el aumento de un 15% para " + empleado2.getNombre() +" es: " + aumentoSalarioEmpleado2);

        System.out.println("Seccion de usuario carga manual--->");

        System.out.println("Hola por favor ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa su apellido");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese su dni");
        String dni = scanner.nextLine();
        System.out.println("Ingrese su salario");
        Double salario = scanner.nextDouble();

        empleado1.setNombre(nombre);
        empleado1.setApellido(apellido);
        empleado1.setDni(dni);
        empleado1.setSalario(salario);

        String datosEmpleado = empleado1.toString();

        System.out.println(datosEmpleado);

        System.out.println("Hola " + nombre + apellido + " vamos a realizar unos calculos...");
        System.out.println("Leyendo su salario inicial...");
        System.out.println("Calculando su salario inicial...");

        Double salarioAnual = empleado1.calcularSalarioAnual(salario);
        System.out.println("Obteniendo salario anual...");
        System.out.println("Su salario anual es de " + salarioAnual + " pesos argentinos");

        System.out.println("Que porcentaje le quiere agregar al salario para calcular ?");
        Double porcentaje = scanner.nextDouble();

        Double salarioConPorcentaje = empleado1.aumentoSalarioXPorcentaje(salario, porcentaje);
        System.out.println("Obteniendo salario con porcentaje...");
        System.out.println("Su salario con el porcentaje de " + porcentaje +
                "% agregado es de " + salarioConPorcentaje + " pesos argentinos");*/

        // Ejercicio2

        /**
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria();

        cuentaBancaria1.setId(1);
        cuentaBancaria1.setNombre("Lautaro Orellano");
        cuentaBancaria1.setSaldo(15000.0);
        cuentaBancaria1.setDeposito(2500.0);

        System.out.println("Usted ingreso a su cuenta: " + cuentaBancaria1.getDeposito() );
        Double saldoNuevoAcreditado = cuentaBancaria1.creditoACuenta();

        cuentaBancaria1.setDebito(1500.0);

        System.out.println("Usted hizo una operacion de debito de su cuenta de: " + cuentaBancaria1.getDebito());
        Double saldoNuevoDebito1 = cuentaBancaria1.debitoDeCuenta(saldoNuevoAcreditado);

        cuentaBancaria1.setDebito(30000.0);

        Double saldoNuevoDebito2 = cuentaBancaria1.debitoDeCuenta(saldoNuevoDebito1);
        */

        // Ejercicio3

        /**
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 500, 10);
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 700, 5);

        String detalleLibro1 = libro1.toString();
        String detalleLibro2 = libro2.toString();
        System.out.println(detalleLibro1);
        System.out.println(detalleLibro2);

        libro1.venderCopias(3);

        String detalleLibroActualizado1= libro1.toString();
        System.out.println(detalleLibroActualizado1);

        libro2.venderCopias(8);
        libro2.incrementarCopias(5);

        String detalleLibroActualizado2= libro2.toString();
        System.out.println(detalleLibroActualizado2);*/

        // Ejercicio4

        ItemVenta itemVenta = new ItemVenta();
        int opcion;

        do {
            System.out.println("------------------------");
            System.out.println("           Menu         |");
            System.out.println("------------------------");
            System.out.println("1- Add item             |");
            System.out.println("2- Get object           |");
            System.out.println("3- Update quantity      |");
            System.out.println("4- Update price         |");
            System.out.println("5- Get totalPrice       |");
            System.out.println("0- Exit                 |");
            System.out.println("------------------------");

            System.out.println("Elige una opción correcta");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del item a cargar");
                    String name = scanner.nextLine();
                    itemVenta.setName(name);
                    scanner.nextLine();
                    System.out.println("Ingrese el stock del producto");
                    int cantidad = scanner.nextInt();
                    itemVenta.setQuantity(cantidad);
                    System.out.println("Ingrese el precio del producto");
                    double precio = scanner.nextDouble();
                    itemVenta.setPrice(precio);
                    break;
                case 2:
                    String getObject = itemVenta.toString();
                    System.out.println(getObject);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a actualizar");
                    int updateQuantity = scanner.nextInt();
                    itemVenta.setQuantity(updateQuantity);
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo precio a actualizar");
                    double updatePrice = scanner.nextDouble();
                    itemVenta.setPrice(updatePrice);
                    break;
                case 5:
                    double priceTotal = itemVenta.calcularPrecioTotal();
                    System.out.println("El precio total por esa cantidad es de : " + priceTotal);
                    break;
                case 0:
                    System.out.println("Gracias por usar mi app, hasta pronto");
                    break;
                default:
                    System.out.println("La opcion es incorrecta");
            }
        } while (opcion != 0);
    }
}