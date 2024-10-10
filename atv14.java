import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float tot = 0,desc = 0;
        int op1 = 0, op2=0, op3=0;

        System.out.print("Informe o valor da compra: ");
        tot = scan.nextFloat();
        scan.nextLine();

        System.out.println(" Qual a forma do pagamento? ");

        espaco();
        
   
        System.out.println("1 - Avista com 10% de desconto");

        System.out.println("2 - Em duas vezes (preço da etiqueta)");
               
        System.out.println("3 - De 3 até 10 vezes com 3% de juros ao mês"); 

        espaco();

        System.out.println("Informe 1, 2 ou 3 para selecionar a opção: ");
        
        op1 = scan.nextInt();
        op2 = scan.nextInt();
        op3 = scan.nextInt();

        if(op1 == 1){ 
            desc = tot * 0.1f;
        System.out.println("O valor é de R$" + desc);
        
        }

        
    }
    
    
    public static void espaco(){
            System.out.println("");
        }
}
