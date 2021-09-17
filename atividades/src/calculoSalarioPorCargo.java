import java.util.Scanner;

public class calculoSalarioPorCargo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String cargo = "";
        double percentAumento = 0.0, aumento = 0.0, salarioAtual = 0.0;

        System.out.print("=== CALCULE SEU NOVO SALARIO ===\n" +
                "1 - Serviços Gerais\t|\t2 - Vigia\t|\t3 - Recepcionista\t|\t4 - Vendedor\n" +
                "Informe seu cargo: ");

        int menu = scan.nextInt();

        while(menu < 1 || menu > 4) {
            System.out.print("Cargo inválido. Digite novamente: ");
            menu = scan.nextInt();
        }

        System.out.print("Informe seu salário: R$ ");
        double salario = scan.nextDouble();

        while(salario <= 0){
            System.out.print("Salário inválido. Informe um valor maior que 0: R$ ");
            salario = scan.nextDouble();
        }

        switch (menu){
            case 1:
                cargo = "SERVIÇOS GERAIS";
                percentAumento = 0.5;
                aumento = salario * percentAumento;
                salarioAtual = salario + aumento;
                break;
            case 2:
                cargo = "VIGIA";
                percentAumento = 0.3;
                aumento = salario * percentAumento;
                salarioAtual = salario + aumento;
                break;
            case 3:
                cargo = "RECEPCIONISTA";
                percentAumento = 0.25;
                aumento = salario * percentAumento;
                salarioAtual = salario + aumento;
                break;
            case 4:
                cargo = "VENDEDOR";
                percentAumento = 0.15;
                aumento = salario * percentAumento;
                salarioAtual = salario + aumento;
                break;
        }

        System.out.printf("CARGO: %s\n" +
                "SALARIO INICIAL: %.2f\n" +
                "PERCENTUAL DE AUMENTO: %.0f%%\n" +
                "VALOR DE AUMENTO: %.2f\n" +
                "SALÁRIO ATUAL: %.2f", cargo, salario, percentAumento * 100, aumento, salarioAtual);

    }
}
