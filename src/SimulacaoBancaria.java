import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quanto você quer depositar?");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();
                    saldo += valorDeposito;
                    System.out.println("Saldo atualizado: " + saldo);
                    continuar = false;
                    break;
                    
                case 2:
                    System.out.println("Quanto você quer sacar?");
                    double valorSacar = scanner.nextDouble();
                    scanner.nextLine();
                    if (saldo >= valorSacar) {
                        saldo -= valorSacar;
                        System.out.println("Saldo atualizado: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    continuar = false;
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
            }
        }
        scanner.close();
    }
}
