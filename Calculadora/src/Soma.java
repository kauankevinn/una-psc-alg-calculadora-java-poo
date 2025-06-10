import java.util.Scanner;

public class Soma {
    String entrada;
    double numero;
    double soma = 0;

    Scanner sc = new Scanner(System.in);
    
    public Double somar(){
        System.out.println("Some quantos números desejar!");
        
        while (true) {
            System.out.print("Número (ou Q para encerrar): ");
            entrada = sc.next().trim();
            if (entrada.equalsIgnoreCase("Q")) {
                break;
            }
            numero = Double.parseDouble(entrada);
            soma += numero;
        }

        System.out.println(soma);

        return soma;
    }
}