import java.util.Scanner;

public class programa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, maiorSalario = 0, somaSalario =0, mediaSalario =0, mediaFilhos =0, percentual=0,  somaFilhos =0;
        int filhos, cont900 = 0,i=1, cont =0;

        System.out.println("Deseja fazer um cadastro? 1 = SIM / 2 = NÃO");
        i = sc.nextInt();

        if (i == 1) {
            while (i == 1) {
                cont++;
                System.out.println("CADASTRO DE PESSOA: ");
                System.out.println("Qual o valor do seu salário? ");
                salario = sc.nextDouble();
                System.out.println("Quantos filhos você tem? ");
                filhos = sc.nextInt();
                System.out.println("Deseja fazer um cadastro? 1 = SIM / 2 = NÃO");
                i = sc.nextInt();

                somaSalario = somaSalario+salario;
                somaFilhos=somaFilhos+filhos;


                if (salario > maiorSalario) {
                    maiorSalario = salario;

                } if (salario<=900.00){
                    cont900++;
                }
                mediaSalario =somaSalario/cont;
                mediaFilhos=somaFilhos/cont;
                percentual = (cont900 * 100)/cont;
            }

        }else
            System.out.println("Finalizado");
        System.out.println("Maior salário: " + maiorSalario);
        System.out.println("Media dos salários: " + mediaSalario);
        System.out.println("A média de filhos é: " + mediaFilhos);
        System.out.println("O percentual de pessoas com o salário de até R$900,00 é: " + percentual + "%");
    }
}
