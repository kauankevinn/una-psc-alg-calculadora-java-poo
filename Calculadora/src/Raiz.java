import java.util.Scanner;

public class Raiz {
    String numero;
    double raiz;

    Scanner sc = new Scanner(System.in);

    public Double raizQuadrada() {

        System.out.println("Tire a raiz de quantos números desejar!");

        while (true) {
            System.out.print("Número (ou Q para encerrar): ");
            numero = sc.next().trim();

            if (numero.equalsIgnoreCase("Q")) {
                break;
            }

            double resposta = Double.parseDouble(numero);

            if (resposta < 0) {
                System.out.println("Não existe raiz de número negativo."); 
                continue;
            }

            raiz = Math.sqrt(resposta);
            System.out.println(raiz);

        }   
         
        return raiz;
    }
}