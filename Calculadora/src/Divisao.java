import java.util.Scanner;

public class Divisao {
    double resultado;

    Scanner sc = new Scanner(System.in);

    public double dividir() {
        
        System.out.println("Divida quantos números desejar! para encerrar a divisão, digite 'Q'");

        while (true) {
            System.out.println("Digite o dividendo");
            String resposta1 = sc.nextLine();
            if (resposta1.equalsIgnoreCase("Q")) break;

            System.out.println("Digite o divisor");
            String resposta2 = sc.nextLine();
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