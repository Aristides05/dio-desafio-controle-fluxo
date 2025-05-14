public class Contador {
    public static void main(String[] args) {
        ColetarParametros coletar = new ColetarParametros();
        int iteracoes = 0;

        try {
            iteracoes = coletar.coletarParametros();
        }catch(ParametrosInvalidosException e){
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro");
            return;
        }
        

        for (int i = 1; i <= iteracoes; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}