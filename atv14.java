import java.util.Scanner;

public class atv14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double tot = 0,valorParc =0, desc = 0, totalDesc = 0 ;
       int parc = 0;

        
        System.out.print("Informe o total gasto: R$ ");
        tot = scanner.nextDouble();

        
        System.out.println("Escolha a opção de pagamento:");
        System.out.println("1. À vista com 10% de desconto");
        System.out.println("2. Em duas vezes (preço da etiqueta)");
        System.out.println("3. De 3 até 10 vezes");

        
        System.out.print("Opção escolhida 1, 2 ou 3: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                
                desc = tot * 0.10;
                totalDesc = tot - desc;
                System.out.printf("Total a pagar à vista com desconto: R$ " + totalDesc);
                break;

            case 2:
                
                System.out.printf("Total em 2 vezes de R$"+ tot / 2 + " cada");
                break;

            case 3:
                
                System.out.print("Informe o número de parcelas (de 3 a 10): ");
                parc = scanner.nextInt();

                if (parc < 3 || parc > 10) {
                    System.out.println("Número de parcelas inválido, deve ser de 3 a 10.");
                } else {
                     valorParc = tot / parc;
                    System.out.printf("Total em "+ parc+ " vezes de R$ "+ valorParc + " cada");
                }
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
                break;
        }

        scanner.close();
    }
}
