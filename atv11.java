import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco =0,kWhConsumidos =0, totalGeral = 0, maiorConsumo = 0, menorConsumo = 0, totalRes = 0, totalCom = 0, totalInd = 0, totalAPagar = 0;

        int numeroConsumidor =0, tipoConsumidor = 0, numConsu = 0;

        
        System.out.print("Informe o preço do KWh: R$ ");
        preco = scanner.nextDouble();
        
        
        while (true) {
            System.out.print("Informe o número do consumidor (ou 0 para sair): ");
            numeroConsumidor = scanner.nextInt();
            if (numeroConsumidor == 0) {
                break; 
            }

            System.out.print("Informe a quantidade de KWh consumidos: ");
            kWhConsumidos = scanner.nextDouble();

            System.out.print("Informe o código do tipo de consumidor (1 - Residencial, 2 - Comercial, 3 - Industrial): ");
            tipoConsumidor = scanner.nextInt();

            
            totalAPagar = kWhConsumidos * preco;
            totalGeral += totalAPagar;
            numConsu++;

           
            if (kWhConsumidos > maiorConsumo) {
                maiorConsumo = kWhConsumidos;
            }
            if (kWhConsumidos < menorConsumo) {
                menorConsumo = kWhConsumidos;
            }

            
            switch (tipoConsumidor) {
                case 1:
                    totalRes += kWhConsumidos;
                    break;
                case 2:
                    totalCom += kWhConsumidos;
                    break;
                case 3:
                    totalInd += kWhConsumidos;
                    break;
                default:
                    System.out.println("Tipo de consumidor inválido.");
            }

            
            System.out.println("Consumidor "+ numeroConsumidor + ": Total a pagar: R$ " + totalAPagar);
        }

        
        double mediaGeral = (numConsu > 0) ? totalGeral / numConsu : 0;

        
        System.out.println("Maior consumo:  " + maiorConsumo + " kWh");
        System.out.println("Menor consumo: "+ menorConsumo + "kWh");
        System.out.println("Total de consumo residencial: "+totalRes+"kWh");
        System.out.println("Total de consumo comercial: "+ totalCom + "kWh");
        System.out.println("Total de consumo industrial: " +totalInd+ " kWh");
        System.out.println("Média geral de consumo:"+ mediaGeral+ "+kWh");


    }
    
}
