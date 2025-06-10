import java.util.Scanner;

public class Multiplicacao {
    String entrada;
    double numero;
    double acumulador = 1;

    Scanner sc = new Scanner(System.in);
    
    public Double multiplicar(){
        System.out.println("Multiplique quantos números desejar! para encerrar a multiplicação, digite 'Q'");

        while (true) {
            entrada = sc.next();
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
