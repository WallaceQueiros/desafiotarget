package calculosoma;

public class Soma {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K += 1;
            SOMA += K;
        }
        System.out.println("Valor final de SOMA: " + SOMA); // Saída esperada: 91
    }
}