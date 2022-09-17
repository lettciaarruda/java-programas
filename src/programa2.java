import java.util.Scanner;

public class programa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores reais");
        System.out.println("Valor 1:");
        int lado1 = sc.nextInt();
        System.out.println("Valor 2:");
        int lado2 = sc.nextInt();
        System.out.println("Valor 3:");
        int lado3 = sc.nextInt();
        int soma = lado1 + lado2 + lado3;

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1) {
            System.out.println("Os valores formam um triângulo!");

            if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
                System.out.println("O triângulo é Equilátero ");
            }
            else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("O triângulo é Escaleno");

            }else
                System.out.println("O triângulo é Isósceles");

        } else
            System.out.println("Os lados não formam um triângulo!");
    }
}