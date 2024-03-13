package main;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de competidores: ");
        int N = scanner.nextInt();

        System.out.print("Digite o número mínimo de vagas para a próxima fase: ");
        int K = scanner.nextInt();

        int[] pontuacoes = new int[N];
        System.out.println("Digite as pontuações dos competidores:");
        for (int i = 0; i < N; i++) {
            pontuacoes[i] = scanner.nextInt();
        }

        // Ordena as pontuações em ordem decrescente
        Arrays.sort(pontuacoes);
        int lastQualifiedScore = pontuacoes[N - K];

        int count = K;
        // Verifica se há empate na última vaga de classificação
        while (count < N && pontuacoes[N - count - 1] == lastQualifiedScore) {
            count++;
        }

        System.out.println("Número de competidores classificados para a próxima fase: " + count);

        // Mostra os competidores classificados
        System.out.println("Competidores classificados:");
        for (int i = N - 1; i >= N - count; i--) {
            System.out.println("Competidor " + (N - i) + ": Pontuação " + pontuacoes[i]);
        }
    }
}
