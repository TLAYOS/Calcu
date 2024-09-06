import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Otracalc {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("¿Que operación necesitas realizar?");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicación");
            System.out.println("4.División");
            System.out.println("5.Cerrar el programa");

            System.out.print("Ingresa la opción que requeres: ");
            System.out.println("Solo aceptare las opciones del 1 al 5 para que no intentes otra");
            choice = scanner.next().charAt(0);

            if (choice == '5') {
                System.out.println("Cerrando el programa...");
                break;
            }

            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            if (choice == '1') {
                result = num1 + num2;
                System.out.println("El resultado de la suma es: " + result);
            } else if (choice == '2') {
                result = num1 - num2;
                System.out.println("El resultado de la resta es: " + result);
            } else if (choice == '3') {
                result = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + result);
            } else if (choice == '4') {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("El resultado de la división es: " + result);
                } else {
                    System.out.println("No se porque, pero según las leyes de las matematicas no puedes dividir entre nada");
                }
            } else {
                System.out.println("¿Si viste que solo acepto las opciones del 1 al 5 no?");
            }

        } while (choice != '5');

        scanner.close();
    }
}
