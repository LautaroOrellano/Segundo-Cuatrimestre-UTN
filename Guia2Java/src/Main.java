import ejercicio2.Autor;
import ejercicio2.Libro;
import ejercicio3.Cliente;
import ejercicio3.Factura;
import ejercicio4.Cilindro;
import ejercicio4.Circulo;
import ejercicio5.Alumno;
import ejercicio5.Persona;
import ejercicio5.Staff;

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
        /**Autor autor = new Autor("Joshua","bloch","joshua@emial.com","M");
        System.out.println(autor);
        Libro libro = new Libro("Effective Java", 450.0, 150, autor);
        System.out.println(libro);
        libro.setPrecio(500.0);
        libro.setStock(50);
        System.out.println(libro.toString());
        System.out.println(libro.getAutor());
        System.out.println(libro.toStringCustom());*/

        // Ejercicio3
        /**Cliente cliente = new Cliente("lautaro","lauta@gmail.com", 1000.0);
        System.out.println(cliente);
        Factura factura = new Factura(cliente,10000.0);
        System.out.println(factura);
        factura.calcularMontoFinalConDescuento(cliente.getDescuento());
        System.out.println(factura);*/

        // Ejercicio4
        /**Cilindro cilindro = new Cilindro();
        System.out.println(cilindro);
        System.out.println("Radio: " + cilindro.getRadio());
        System.out.println("Altura: " + cilindro.getAltura());
        System.out.println("Area de la base: " + cilindro.calcularAreaCirculo());
        System.out.println("Volumen: " + cilindro.calcularVolumen());

        Cilindro cilindro1 = new Cilindro(1.2,2.0);
        System.out.println(cilindro1);
        System.out.println("Radio: " + cilindro1.getRadio());
        System.out.println("Altura: " + cilindro1.getAltura());
        System.out.println("Area de la base: " + cilindro1.calcularAreaCirculo());
        System.out.println("Volumen: " + cilindro1.calcularVolumen());*/

        // Ejercicio5
        /**Alumno alumno1 = new Alumno();
        alumno1.setDni("38679008");
        alumno1.setNomre("Gabriela");
        alumno1.setApellido("Gomez");
        alumno1.setEmail("gabrielagomez@gmail.com");
        alumno1.setDireccion("JB justo 3223");
        alumno1.setAñoIngreso(2024);
        alumno1.setCuotaMensual(80000);
        alumno1.setCarrera("programacion");

        Alumno alumno2 = new Alumno();
        alumno2.setDni("45678905");
        alumno2.setNomre("Ricardo");
        alumno2.setApellido("Florez");
        alumno2.setEmail("ricardoFlorez@gmail.com");
        alumno2.setDireccion("12 de octubre 3223");
        alumno2.setAñoIngreso(2025);
        alumno2.setCuotaMensual(90000);
        alumno2.setCarrera("programacion");

        Alumno alumno3 = new Alumno();
        alumno3.setDni("39440384");
        alumno3.setNomre("Alberto");
        alumno3.setApellido("Tigloci");
        alumno3.setEmail("alberto@gmail.com");
        alumno3.setDireccion("magallanes 223");
        alumno3.setAñoIngreso(2025);
        alumno3.setCuotaMensual(90000);
        alumno3.setCarrera("administracion de empresas");

        Alumno alumno4 = new Alumno();
        alumno4.setDni("43322045");
        alumno4.setNomre("Cristina");
        alumno4.setApellido("Ciliento");
        alumno4.setEmail("ciliento12@gmail.com");
        alumno4.setDireccion("alma fuerte 2123");
        alumno4.setAñoIngreso(2025);
        alumno4.setCuotaMensual(90000);
        alumno4.setCarrera("administracion de empresas");

        Staff staff1 = new Staff();
        staff1.setDni("30455044");
        staff1.setNomre("Maria");
        staff1.setApellido("Nuñez");
        staff1.setEmail("mariaNu@gmail.com");
        staff1.setDireccion("margaritas 1223");
        staff1.setSalario(1000);
        staff1.setTurno("Noche");

        Staff staff2 = new Staff();
        staff2.setDni("28423454");
        staff2.setNomre("Raul");
        staff2.setApellido("Quinteros");
        staff2.setEmail("QuinterosR@gmail.com");
        staff2.setDireccion("Alvarado 3623");
        staff2.setSalario(1100);
        staff2.setTurno("Noche");

        Staff staff3 = new Staff();
        staff3.setDni("31232245");
        staff3.setNomre("Daniel");
        staff3.setApellido("Alvaros");
        staff3.setEmail("AlvDani@gmail.com");
        staff3.setDireccion("chubut 346");
        staff3.setSalario(900);
        staff3.setTurno("tarde");

        Staff staff4 = new Staff();
        staff4.setDni("34323545");
        staff4.setNomre("Mariela");
        staff4.setApellido("Sanchez");
        staff4.setEmail("Sanchez@gmail.com");
        staff4.setDireccion("gaboto 6345");
        staff4.setSalario(950);
        staff4.setTurno("tarde");

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(alumno1);
        personas.add(alumno2);
        personas.add(alumno3);
        personas.add(alumno4);

        personas.add(staff1);
        personas.add(staff2);
        personas.add(staff3);
        personas.add(staff4);

        int contAlumnos = 0;
        int contStaff = 0;
        int totalCuotaAlumno = 0;

        for (Persona p : personas ) {
            if (p instanceof Alumno) {
                contAlumnos++;
                totalCuotaAlumno = totalCuotaAlumno + ((Alumno) p).getCuotaMensual();
                //Alumno a = (Alumno) p;
                //System.out.println(p);
            } else if (p instanceof Staff) {
                contStaff++;
                //Staff s = (Staff) p;
                //System.out.println(p);
            }
        }
        System.out.println("Cantidad de alumnos: " + contAlumnos);
        System.out.println("Cantidad de staff: " + contStaff);
        System.out.println("El total de la cuota mensual de los alumnos es: " + totalCuotaAlumno);*/
    }
}