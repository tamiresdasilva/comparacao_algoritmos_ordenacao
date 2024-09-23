import java.util.Random;

public class Ordenacao {
    public static Resultado bubbleSort(int[] array){
        int n = array.length;
        int comparacoes = 0;
        int trocas = 0;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                comparacoes++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocas++;
                }
            }
        }
        return new Resultado(array, comparacoes, trocas);
    }

    public static Resultado selectionSort(int[] array) {
        int n = array.length;
        int comparacoes = 0;
        int trocas = 0;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                comparacoes++;
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                trocas++;
                int temp = array[min_idx];
                array[min_idx] = array[i];
                array[i] = temp;
            }
        }
        return new Resultado(array, comparacoes, trocas);
    }


    public static Resultado insertionSort(int[] array){
        int n = array.length;
        int comparacoes = 0;
        int trocas = 0;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                comparacoes++;
                array[j + 1] = array[j];
                trocas++;
                j = j - 1;
            }
            comparacoes++;
            array[j + 1] = key;
        }
        return new Resultado(array, comparacoes, trocas);
    }


    public static int[] gerarArrayOrdenado(int tamanho) {
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = i;
        }
        return array;
    }


    public static int[] gerarArrayOrdenadoInversamente(int tamanho) {
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = tamanho - i - 1;
        }
        return array;
    }


    public static int[] gerarArrayAleatorio(int tamanho) {
        int[] array = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(tamanho);
        }
        return array;
    }
}
