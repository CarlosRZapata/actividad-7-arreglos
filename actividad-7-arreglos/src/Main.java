import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números enteros que desea procesar: ");
        int TotalNum = t.nextInt();
        int[] numeros = new int[TotalNum];
        System.out.println("Ingrese " + TotalNum + " números enteros:");
        for (int i = 0; i < TotalNum; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = t.nextInt();
        }
        t.close();
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < TotalNum; i++) {
            int numero = numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + "\t\t" + cuadrado + "\t\t\t" + cubo);
        }
    }
}