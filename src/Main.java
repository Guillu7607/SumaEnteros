import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        int suma = 0;
        int num;
        int contador = 0;
        while (continuar) {
            System.out.println("Ingrese numeros: ");
            num = sc.nextInt();

            if (num == 0) {
                continuar = false;
            } else {
                suma = suma + num;
                contador++;
            }
        }

        System.out.println("La suma es: " + suma);
        System.out.println("La cantidad de numeros es: " + contador);
    }
}
