import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class casoTabuleiroSecreto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nq = br.readLine().split(" ");
        int tamTab = Integer.parseInt(nq[0]);
        int numOp = Integer.parseInt(nq[1]);
        int[][] matriz = new int[tamTab][tamTab];

        for (int i = 0; i < tamTab; i++) {
            for (int j = 0; j < tamTab; j++) {
                matriz[i][j] = 0;
            }
        }

        for (int i = 0; i < numOp; i++) {
            String[] operacao = br.readLine().split(" ");
            int tipoOp = Integer.parseInt(operacao[0]);
            int linha = Integer.parseInt(operacao[1]);
            int valor = 0;

            if (operacao.length == 3) {
                valor = Integer.parseInt(operacao[2]);
            }

            switch (tipoOp) {
                case 1:
                    atribuiLinhaX(linha, valor, matriz);
                    break;
                case 2:
                    atribuiColunaX(linha, valor, matriz);
                    break;
                case 3:
                    imprimirFrequenteLinhaX(linha, matriz);
                    break;
                case 4:
                    imprimirFrequenteColunaX(linha, matriz);
                    break;
            }
        }
    }

    private static void imprimirFrequenteColunaX(int col,
            int[][] matriz) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(matriz[0][col - 1], 1);

        for (int i = 1; i < matriz.length; i++) {
            if (map.containsKey(matriz[i][col - 1])) {
                map.put(matriz[i][col - 1], map.get(matriz[i][col - 1]) + 1);
            } else {
                map.put(matriz[i][col - 1], 1);
            }
        }

        var key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get()
                .getKey();

        if (map.get(key) == 1) {
            key = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get()
                    .getKey();
        }

        System.out.println(key);
    }

    private static void imprimirFrequenteLinhaX(int linha,
            int[][] matriz) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(matriz[linha - 1][0], 1);

        for (int i = 1; i < matriz.length; i++) {
            if (map.containsKey(matriz[linha - 1][i])) {
                map.put(matriz[linha - 1][i], map.get(matriz[linha - 1][i]) + 1);
            } else {
                map.put(matriz[linha - 1][i], 1);
            }
        }

        var key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get()
                .getKey();

        if (map.get(key) == 1) {
            key = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get()
                    .getKey();
        }

        System.out.println(key);
    }

    private static void atribuiColunaX(int col,
            int valor,
            int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][col - 1] = valor;
        }
    }

    private static void atribuiLinhaX(int linha,
            int valor,
            int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[linha - 1][i] = valor;
        }
    }
}