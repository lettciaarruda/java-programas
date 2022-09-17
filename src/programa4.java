import java.util.Scanner;

public class programa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int menor = 0;
        int maior = 0;
        int n;
        int i = 0;

        for (i = 1; i <= 50; i++) {
            System.out.println("Digite um número inteiro");
            n = sc.nextInt();


            if (n < menor) {
                menor = n;
            } else if (n > maior) {
                maior = n;
            }

            if(n>-1){
                positivos++;
            }


        }
        System.out.println("Você digitou " +  positivos +" numeros positivos.");
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}