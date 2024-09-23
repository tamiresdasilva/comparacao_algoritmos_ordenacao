public class Resultado {
    private int[] array;
    private int comparacoes;
    private int trocas;

    public Resultado(int[] array, int comparacoes, int trocas) {
        this.array = array;
        this.comparacoes = comparacoes;
        this.trocas = trocas;
    }

    public int[] getArray() {
        return array;
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int getTrocas() {
        return trocas;
    }
}
