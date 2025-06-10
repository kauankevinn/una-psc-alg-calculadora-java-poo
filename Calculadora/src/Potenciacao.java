import java.util.Scanner;

public class Potenciacao {
    double numero;
    double resultado;
    double subtracao = 0;

    Scanner sc = new Scanner(System.in);
    
    public Double potenciar(){

        // Math.pow(subtracao, subtracao);
        System.out.println("Descubra a potência dos números!");

        while (true) {
            System.out.println("Digite o número base (ou Q para encerrar): ");
            String resposta1 = sc.next().trim();
            if (resposta1.equalsIgnoreCase("Q")) break;

            System.out.println("Digite o expoente (ou Q para encerrar): ");
            String resposta2 = sc.next().trim();
            if(resposta2.equalsIgnoreCase("Q")) break;

            double base = Double.parseDouble(resposta1);
            double expoente = Double.parseDouble(resposta2);

            resultado = Math.pow(base, expoente);

            System.out.println(resultado);
        }
        
        return resultado;
    }
}
