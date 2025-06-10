import java.util.Scanner;

public class Potenciacao {
    double numero;
    double subtracao = 0;

    Scanner sc = new Scanner(System.in);
    
    public Double potenciar(){
        System.out.println("Subtraia quantos números desejar! para encerrar a potência, digite 0");

        subtracao = sc.nextDouble();
        
        while (true) {
            numero = sc.nextDouble();
            
            if (numero == 0) {
                break;
            }

            subtracao -= numero;
        }

        System.out.println(subtracao);
        
        return subtracao;
    }
}
