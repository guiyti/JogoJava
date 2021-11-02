import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\n");

        Scanner input = new Scanner(System.in);

        

        // int codigoCorreto = (int) rand;
        int codigoCorreto = 5431;
        
        // declaração de variáveis
        String entrada;
        int valorEntrada;
        int tentativas = 0;

        // núcleo do programa
        do {
            // bloco entrada de dados
            System.out.print("Digite um número: ");
            entrada = input.nextLine();

            // bloco avalia sair do programa
            if (entrada.equals("sair")) {
                System.out.print("Você deseja realmente sair? ");
                entrada = input.nextLine();
                if (entrada.equals("sim")) {
                    System.out.print("Programa finalizado! \n");
                    break;
                }
            }
            valorEntrada = Integer.parseInt(entrada);
            
            
            // bloco execução da tentativa
            tentativas++ ;
            if (valorEntrada == codigoCorreto) {
                System.out.println("VOCÊ ACERTOU \n");
                System.out.println("Você precisou de "+ tentativas + " tentativas");

                if(tentativas == 1){
                    System.out.println("CARALHOOO");
                }

            } else {
                System.out.println("VOCÊ ERROU \n");
            }

        } while (valorEntrada != codigoCorreto);


        System.out.println("\n");
        input.close();

    }
}
