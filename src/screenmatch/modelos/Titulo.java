package screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int qtdAvaliacoes;
    private int duracaoMin;

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoMin);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        qtdAvaliacoes++;
    }

    public double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / qtdAvaliacoes;
    }

    public int getQtdAvaliacoes() {
        return qtdAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }
}
