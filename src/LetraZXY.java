import java.util.Scanner;

public class LetraZXY {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Enter com 3 numeros:");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int maior = max(a, b, c);
        mostrarResultado(maior);
        entrada.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void mostrarResultado(int value) {
        System.out.println("Maior = " + value);
    }
}
