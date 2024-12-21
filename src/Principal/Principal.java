package Principal;

import Consultas.ConsultaConversor;
import Consultas.FiltroMoneda;
import Modelos.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            ConsultaConversor consultaConversor = new ConsultaConversor();
            FiltroMoneda filtroMoneda = new FiltroMoneda();

        while (true) {
            System.out.println("**************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("**************************************************");
            System.out.print("Elija una opción válida: ");

            int opcion = scanner.nextInt();
            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                break;
            }

            String origen = "", destino = "";
            switch (opcion) {
                case 1 -> { origen = "USD"; destino = "ARS"; }
                case 2 -> { origen = "ARS"; destino = "USD"; }
                case 3 -> { origen = "USD"; destino = "BRL"; }
                case 4 -> { origen = "BRL"; destino = "USD"; }
                case 5 -> { origen = "USD"; destino = "COP"; }
                case 6 -> { origen = "COP"; destino = "USD"; }
                default -> {
                    System.out.println("Opción inválida. Intente de nuevo.");
                    continue;
                }
            }

            System.out.print("Ingrese el valor que deseas convertir: ");
            double cantidad = scanner.nextDouble();

            try {
                Moneda moneda = consultaConversor.buscaMoneda(origen);
                double tasaDeCambio = filtroMoneda.obtenerTasaDeCambio(moneda, destino);
                if (tasaDeCambio == 0.0) {
                    System.out.println("No se encontró la tasa de cambio. Intente más tarde.");
                    continue;
                }

                double resultado = cantidad * tasaDeCambio;
                System.out.println("**************************************************");
                System.out.printf("El valor %.2f [%s] corresponde al valor final de >>> %.2f [%s]%n",
                        cantidad, origen, resultado, destino);
                System.out.println("**************************************************");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}