import java.util.Scanner;

public class Soma {
    String entrada;
    double numero;
    double soma = 0;

    Scanner sc = new Scanner(System.in);
    
    public Double somar(){
        System.out.println("Some quantos números desejar! para encerrar a soma, digite 'Q'");
        
        while (true) {
            entrada = sc.next();
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