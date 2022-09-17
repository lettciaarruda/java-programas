import java.math.BigDecimal;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class programa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println(new DecimalFormatSymbols());

        System.out.println("Calculando as notas");
        System.out.println("Digite a nota1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota2:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota3: ");
        double nota3 = sc.nextDouble();

        System.out.println("Como prefere que a nota seja calculada?:  A= média aritmética / P= média ponderada");
        String forma = sc.next();

        switch (forma) {
            case "A":

                double mediaA = (nota1+nota2+nota3)/3;
                System.out.println("A média aritmética do aluno é: "+ mediaA);

                if (mediaA <= 4.9) {
                    System.out.println("A nota é de conceito D");
                }
                else if (mediaA >= 5.0 && mediaA <= 6.9) {
                    System.out.println("A nota é de conceito C");
                }
                else if (mediaA >= 7.0  && mediaA <= 8.9) {
                    System.out.println("A nota é de conceito B");
                } else
                    System.out.println("A nota é de conceito A");

                break;

            case "P":
                double mediaP = (nota1 * 2 + nota2 * 4 + nota3 * 6) / 10;
                System.out.println("A média ponderada é: " + mediaP);

                if (mediaP <= 4.9) {
                    System.out.println("A nota é de conceito D");
                }
                else if (mediaP >= 5.0 && mediaP <= 6.9) {
                    System.out.println("A nota é de conceito C");
                }
                else if (mediaP >= 7.0  && mediaP <= 8.9) {
                    System.out.println("A nota é de conceito B");
                } else
                    System.out.println("A nota é de conceito A");

                break;

            default:
                System.out.println("ERRO!");
        }
    }
}