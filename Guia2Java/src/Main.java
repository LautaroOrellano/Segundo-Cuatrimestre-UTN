import ejercicio2.Autor;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio1
        /**ArrayList<ejercicio1.Empleado> empleados = new ArrayList<>();
        int opcion;

        do{
            System.out.println("------------------------------------------");
            System.out.println("   --- Menú Gestión de Empleados ---     |");
            System.out.println("1. Agregar empleado tiempo completo      |");
            System.out.println("2. Agregar empleado por horas            |");
            System.out.println("3. Agregar empleado contratista          |");
            System.out.println("4. Mostrar empleados y calcular pagos    |");
            System.out.println("0. Salir                                 |");
            System.out.println("------------------------------------------");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("Nombre: ");
                    String nombreTP = scanner.nextLine();
                    System.out.println("Salario: ");
                    Double salarioTP = scanner.nextDouble();
                    empleados.add(new ejercicio1.EmpleadoTiempoCompleto(nombreTP, salarioTP));
                    break;
                case 2:
                    System.out.println("Nombre: ");
                    String nombrePH = scanner.nextLine();
                    System.out.println("Pago por hora: ");
                    Double pagoH = scanner.nextDouble();
                    System.out.println("Horas trabajadas: ");
                    int horasT = scanner.nextInt();
                    empleados.add(new ejercicio1.EmpleadoPorHora(nombrePH, pagoH, horasT));
                    break;
                case 3:
                    System.out.println("Nombre: ");
                    String nombreC = scanner.nextLine();
                    System.out.println("Pago por hora: ");
                    Double salarioC = scanner.nextDouble();
                    System.out.println("Horas trabajadas: ");
                    int horasTC = scanner.nextInt();
                    System.out.println("Tarifa por proyecto: ");
                    Double tarifaP = scanner.nextDouble();
                    empleados.add(new ejercicio1.EmpleadoContratista(nombreC, salarioC, horasTC, tarifaP));
                    break;
                case 4:
                    System.out.println("----Lista de empleados----");
                    for (ejercicio1.Empleado e : empleados) {
                        System.out.println("Empleado: " + e.getNombre() +
                                " | pago: $" + e.calcularPago());
                    }
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestra app, hasta la proxima");
                    break;
                default:
                    System.out.println("opcion invalida, ingresa de nuevo una opcion correcta");
            }
        } while(opcion != 0);*/

        // Ejercicio2
        Autor autor = new Autor("Joshua","bloch","joshua@emial.com","M");

        System.out.println(autor);


    }
}