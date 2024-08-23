package parcial1;

import java.util.Scanner;

public class parcial1 {

    private static double obtenertasaRodamiento(int decada) {
        switch (decada) {
            case 90:
                return 0.0409;
            case 0:
                return 0.0434;
            case 10:
                return 0.0493;
            case 20:
                return 0.0568;
            default:
                return 0;
        }
    }

    private static double obtenertasaSeguro(int decada) {
        switch (decada) {
            case 90:
                return 0.00816;
            case 0:
                return 0.00798;
            case 10:
                return 0.00712;
            case 20:
                return 0.00699;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadVehiculos = 0;
        int decada = 0;
        int avaluo = 0;

        System.out.println("Agregue la cantidad de vehiculos");
        cantidadVehiculos = sc.nextInt();

        for (int i = 1; i <= cantidadVehiculos; i++) {

            System.out.print("Ingrese el avalúo del vehículo: ");
            avaluo = sc.nextInt();

            System.out.print("Ingrese la década del modelo del vehículo (90, 00, 10, 20): ");
            decada = sc.nextInt();

            double tasaRodamiento = obtenertasaRodamiento(decada);
            double tasaSeguro = obtenertasaSeguro(decada);
            double impuestoRodamiento = avaluo * tasaRodamiento;
            double seguro = avaluo * tasaSeguro;
            double totalAPagar = impuestoRodamiento + seguro;

            System.out.println("Vehículo " + cantidadVehiculos);
            System.out.println("Avalúo: " + avaluo);
            System.out.println("Década: " + decada);
            System.out.println("Total A Pagar: " + totalAPagar);
        }
        sc.close();
    }

}
