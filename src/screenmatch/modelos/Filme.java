public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int qtdAvaliacoes;
    int duracaoMin;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        qtdAvaliacoes++;
    }

    double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / qtdAvaliacoes;
    }

    int getQtdAvaliacoes() {
        return qtdAvaliacoes;
    }
}
