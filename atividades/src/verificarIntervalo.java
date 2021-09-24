import java.util.Scanner;

public class verificarIntervalo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int in = 0;
        int out = 0;

        System.out.print("Informe a quantidade de numeros inteiros que deseja informar: ");
        int quantidade = sc.nextInt();

        for(int i = 0; i < quantidade; i++){
            System.out.printf("Informe o %dº número inteiro: ", i+1);
            int numero = sc.nextInt();

            if(numero >= 10 && numero <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in\n%d out", in, out);

    }
}
