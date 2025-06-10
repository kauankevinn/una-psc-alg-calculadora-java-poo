import java.util.Scanner;

public class Multiplicacao {
    String entrada;
    double numero;
    double acumulador = 1;

    Scanner sc = new Scanner(System.in);
    
    public Double multiplicar(){
        System.out.println("Multiplique quantos números desejar! ");

        while (true) {
            System.out.print("Número (ou Q para encerrar): ");
            entrada = sc.next().trim();
            if (entrada.equalsIgnoreCase("Q")) {
                break;
            }
            numero = Double.parseDouble(entrada);
            acumulador *= numero;
        }

        System.out.println(acumulador);
        
        return acumulador;
    }
}
