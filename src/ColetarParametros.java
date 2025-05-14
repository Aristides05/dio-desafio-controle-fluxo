import java.util.Scanner;

public class ColetarParametros {
    public int coletarParametros() throws ParametrosInvalidosException{
        Scanner scanner = new Scanner(System.in);
   
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int numero2 =scanner.nextInt();
        
        
        if (numero2 > numero1){
            scanner.close();
            return numero2 - numero1;
        }
        
        scanner.close();
        throw new ParametrosInvalidosException(); 
    }
}
