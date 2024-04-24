import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("por favor ingrese la temperatura para convertir a Fahrenheit");
        double temperatura = scanner.nextDouble();

        double resultado = (temperatura * 1.8) + 32.;
        System.out.println("si la temperatura es de : " + temperatura + " grados celsius, en Fahrenheit son: " + resultado + " grados");

        int fahrenheit = (int) resultado;
        System.out.println("grados Fahrenheit enteros : " + fahrenheit);
    }
}