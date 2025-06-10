import java.util.Scanner;

public class Subtracao {
    double subtracao;

    Scanner sc = new Scanner(System.in);
    
    public Double subtrair(){
        System.out.println("Subtraia quantos números desejar!");
        
        while (true) {
            System.out.print("Digite o minuendo (ou Q para encerrar): ");
            String resposta1 = sc.next().trim();

            if (resposta1.equalsIgnoreCase("Q")) {
                break;
            }

            double minuendo = Double.parseDouble(resposta1);

            System.out.print("Subtraendo (ou Q para encerrar): ");
            String resposta2 = sc.next().trim();
            
            if (resposta2.equalsIgnoreCase("Q")) {
                break;
            }

            double subtraendo = Double.parseDouble(resposta2);

            subtracao = minuendo-subtraendo;

            System.out.println(subtracao);
        }
        return subtracao;
    }
}
