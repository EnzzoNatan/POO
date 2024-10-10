import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cod = 0;

        System.out.println("Por favor, digite o código do produto");
        System.out.print("Lembrando que os codigos de produtos vão do 1 ou 15: ");
        cod = scan.nextInt();

        switch(cod){
            case 1:
                System.out.println("Alimento não-precivel");
                break;
            case 2,3,4:
                System.out.println("Alimento não-perecivel");
            break;

            case 5,6:
                System.out.println("Vestuario");
            break;
            
            case 7:
                System.out.println("Higiene pessoal");
            break;

            case 8,9,10,11,12,13,14,15:
                System.out.println("Limpeza e utensilios domesticos");
            break;

            default:
                System.out.println("Invalido");
        }   

    }
}
