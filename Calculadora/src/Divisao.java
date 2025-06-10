import java.util.Scanner;

public class Divisao {
    double resultado;

    Scanner sc = new Scanner(System.in);

    public double dividir() {
        
        System.out.println("Divida quantos números desejar! para encerrar a divisão, digite 'Q'");

        while (true) {
            System.out.print("Dividendo (ou Q para encerrar):  ");
            String resposta1 = sc.next().trim();
            if (resposta1.equalsIgnoreCase("Q")) break;

            System.out.print("Divisor (ou Q para encerrar): ");
            String resposta2 = sc.next().trim();
            if(resposta2.equalsIgnoreCase("Q")) break;

            double dividendo = Double.parseDouble(resposta1);
            double divisor = Double.parseDouble(resposta2);

            if (divisor == 0) {
                System.out.println("Impossível realizar uma divisão por zero.");
                continue;
            }

            resultado = dividendo/divisor;

            System.out.println(resultado);
        }
        
        return resultado;
    
    }
}