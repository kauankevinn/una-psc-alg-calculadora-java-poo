import java.util.Scanner;

public class Subtracao {
    String entrada;
    double numero;
    double subtracao = 0;

    Scanner sc = new Scanner(System.in);
    
    public Double subtrair(){
        System.out.println("Subtraia quantos números desejar! para encerrar a subtração, digite 'Q'");

        subtracao = sc.nextDouble();

        while (true) {
            entrada = sc.next();
            numero = Double.parseDouble(entrada);
            
            if (entrada.equalsIgnoreCase("Q")) {
                break;
            }

            subtracao -= numero;
        }

        System.out.println(subtracao);
        
        return subtracao;
    }
}
