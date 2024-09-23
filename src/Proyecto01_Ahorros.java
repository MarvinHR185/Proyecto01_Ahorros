import java.util.Scanner;

public class Proyecto01_Ahorros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String cargo;
        double ingresoMensual;
        double gastoMensual;

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese el cargo del empleado: ");
        cargo = scanner.nextLine();
        System.out.print("Ingrese el ingreso mensual del empleado: ");
        ingresoMensual = scanner.nextDouble();
        System.out.print("Ingrese el gasto mensual del empleado: ");
        gastoMensual = scanner.nextDouble();

        double ahorroMensual = ingresoMensual - gastoMensual;

        double ahorroBimestral = ahorroMensual * 2;
        double ahorroSemestral = ahorroMensual * 6;
        double ahorroAnual = ahorroMensual * 12;

        System.out.println("\n--- Resumen del Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Ingreso Mensual: " + ingresoMensual);
        System.out.println("Gasto Mensual: " + gastoMensual);
        System.out.println("Ahorro Mensual: " + ahorroMensual);
        System.out.println("Ahorro Bimestral: " + ahorroBimestral);
        System.out.println("Ahorro Semestral: " + ahorroSemestral);
        System.out.println("Ahorro Anual: " + ahorroAnual);
    }
}
