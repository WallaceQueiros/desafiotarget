package faturamentodiario;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {

        double[] faturamento = {1000, 2000, 1500, 0, 2500, 3000, 0, 4000, 500, 700, 0, 3500, 1200, 1800, 0};

        calcularFaturamento(faturamento);
    }

    public static void calcularFaturamento(double[] faturamento) {
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menor) {
                    menor = valor;
                }
                if (valor > maior) {
                    maior = valor;
                }
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;

        int diasAcimaDaMedia = 0;
        for (double valor : faturamento) {
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento do mês: " + menor);
        System.out.println("Maior faturamento do mês: " + maior);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}