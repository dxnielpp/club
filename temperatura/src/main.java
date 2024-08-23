import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su temperatura ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = convertirFahrenheitACelsius(temperaturaFahrenheit);
        mostrarMensaje(temperaturaCelsius);
    }


    public static double convertirFahrenheitACelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5/9;
    }


    public static void mostrarMensaje(double temperaturaCelsius) {
        System.out.println("La temperatura en Celsius es: " + temperaturaCelsius + "°C");


        if (temperaturaCelsius > 30) {
            System.out.println("La temperatura es alta.");
        } else {
            System.out.println("La temperatura es baja.");
        }
    }
}
