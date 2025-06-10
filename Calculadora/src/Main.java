import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual tipo de operação você deseja fazer?\n-1.Soma-\n-2.Subtração-\n-3.Multiplicação-\n-4.Divisão-\n-5.Potenciação-\n-6.Raiz-\n-Para encerrar o programa digite 'Q'");
            String num = sc.nextLine().trim().toUpperCase();
            switch (num) {
                case "1":
                    Soma soma = new Soma();
                    soma.somar();
                    continue;
                case "2":
                    Subtracao subtracao = new Subtracao();
                    subtracao.subtrair();
                    continue;
                case "3":
                    Multiplicacao multiplicacao = new Multiplicacao();
                    multiplicacao.multiplicar();
                    continue;
                case "4":
                    Divisao divisao = new Divisao();
                    divisao.dividir();
                    continue;
                case "5":
                    Potenciacao potenciacao = new Potenciacao();
                    potenciacao.potenciar();
                    continue;
                case "6":
                    Raiz raiz = new Raiz();
                    raiz.raizQuadrada();
                    continue;
                case "Q":
                    System.out.println("Programa encerrando...");
                    break;
                default:
                    System.out.println("Digite um número válido de 1 a 6, ou digite Q para encerrar o programa");
                    continue;
            }
            sc.close();
            } 
    }
}