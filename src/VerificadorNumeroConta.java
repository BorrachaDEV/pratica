import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        
    try (Scanner scanner = new Scanner(System.in)) {
       
        System.out.println();
        String numeroConta = scanner.next();
        verificarNumeroConta(numeroConta);

        System.out.println("Numero de conta valido.");

    }catch(IllegalArgumentException e){

        System.out.println("Erro: " + e.getMessage());
    }
}

private static void verificarNumeroConta(String numeroConta){

    if (numeroConta.length()!=8){
        throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }       
    }  
}