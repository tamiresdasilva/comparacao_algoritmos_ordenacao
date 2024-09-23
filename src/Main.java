import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        long inicio, fim; //aguardar hora atual em milisegundos

        Resultado resultado;

        System.out.println("Bubble Sort");
        inicio = System.currentTimeMillis();
        resultado = Ordenacao.bubbleSort(array.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + " ms");
        System.out.println("Comparações: " + resultado.getComparacoes());
        System.out.println("Trocas: " + resultado.getTrocas());

        System.out.println("\nSelection Sort");
        inicio = System.currentTimeMillis();
        resultado = Ordenacao.selectionSort(array.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + " ms");
        System.out.println("Comparações: " + resultado.getComparacoes());
        System.out.println("Trocas: " + resultado.getTrocas());

        System.out.println("\nInsertion Sort");
        inicio = System.currentTimeMillis();
        resultado = Ordenacao.insertionSort(array.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio) + " ms");
        System.out.println("Comparações: " + resultado.getComparacoes());
        System.out.println("Trocas: " + resultado.getTrocas());

    }
}