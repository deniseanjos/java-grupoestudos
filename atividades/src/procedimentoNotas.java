import java.util.Locale;
import java.util.Scanner;

public class procedimentoNotas {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        ler_notas();
    }

    static void cabecalho(){
        saida("\n=== CALCULO DE NOTAS ===\n");
    }

    static int valida_alunos(int qtdAlunos, int valorMinimo){
        while (qtdAlunos < valorMinimo) {
            qtdAlunos = entrada_int("Valor inválido. Favor informar 1 ou mas alunos: ");
        }
        return qtdAlunos;
    }

    static void ler_notas(){
        int alunos = valida_alunos(entrada_int("Informe a quantidade de alunos: "), 1);

        for(int i = 0; i < alunos; i++) {
            double nota1 = entrada_double("Informe o valor da 1ª nota: ");
            double nota2 = entrada_double("Informe o valor da 2ª nota: ");
            double nota3 = entrada_double("Informe o valor da 3ª nota: ");
            escolha_calculo(nota1, nota2, nota3);
        }

    }

    static void saida(String msg){
        System.out.print(msg);
    }

    static int entrada_int(String msg){
        saida(msg);
        int entrada = sc.nextInt();
        return entrada;
    }

    static double entrada_double(String msg){
        saida(msg);
        double entrada = valida_double(sc.nextDouble());
        return entrada;
    }

    static char entrada_char(String msg){
        saida(msg);
        char entrada = sc.next().toUpperCase().charAt(0);
        return entrada;
    }

    static char valida_char(char entrada, char opcaoA, char opcaoB) {
        while (entrada != opcaoA && entrada != opcaoB) {
            entrada = entrada_char("Opção inválida. Digite novamente: ");
        }
        return entrada;
    }

    static double valida_double(double entrada){
        while(entrada < 0 || entrada > 10){
            entrada = entrada_double("Valor informado não é válido. Digite um valor entre 0 e 10: ");
        }
        return entrada;
    }

    static void escolha_calculo(double nota1, double nota2, double nota3){
        char opcao = valida_char(entrada_char("Digite A para calcular a média aritmética ou P para média ponderada: "), 'A', 'P');
        double resultado = 0.0;
        String calculo = "";
        switch (opcao) {
            case 'A': resultado = media_aritmetica(nota1, nota2, nota3);
            calculo = "Média Aritmética";

                break;
            case 'P': resultado = media_aritmetica(nota1,nota2,nota3);
                calculo = "Média Ponderada";
                break;
        }
        saida("Resultado da " + calculo + " é de " + resultado + "\n");
    }

    static double media_aritmetica(double nota1, double nota2, double nota3){
        double calculo = (nota1 + nota2 + nota3) / 3.0;
        return calculo;
    }

    static double media_ponderada(double nota1, double nota2, double nota3){
        double calculo = ((nota1 * 5.0) + (nota2 * 3.0) + (nota3 * 2.0)) / (5.0 + 3.0 + 2.0);
        return calculo;
    }
}
