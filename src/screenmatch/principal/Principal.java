package screenmatch.principal;

import screenmatch.calculo.CalculadoraDeTempo;
import screenmatch.calculo.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme("O tumulo dos vagalumes", 1988);
       // meuFilme.setNome("O tumulo dos Vagalumes"); - não é necessário mais por causa do constructor Filme
       // meuFilme.setAnoDeLancamento(1988);
        meuFilme.setDuracaoMin(89);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoMin());

       meuFilme.exibeFichaTecnica();
       meuFilme.avalia(8);
       meuFilme.avalia(5);
       meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getQtdAvaliacoes());
        System.out.println("Media das Avaliações: " + meuFilme.mediaDasAvaliacoes());

        Serie lost = new Serie("Lost", 2000);
        // lost.setNome("Lost");
        // lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpPorTemporada(10);
        lost.setMinPorEp(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoMin());

        Filme outroFilme = new Filme("Avatar", 2023);
        // outroFilme.setNome("Avatar");
        // outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoMin(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDaMari = new Filme("Guerreiras do Kpop", 2024);
        filmeDaMari.setDuracaoMin(150);
        //filmeDaMari.setNome("Guerreiras do Kpop");
        // filmeDaMari.setAnoDeLancamento(2024);
        filmeDaMari.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaMari);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.getFirst().getNome());
        System.out.println(listaDeFilmes);
        System.out.println("To string do filme: " + listaDeFilmes.getFirst().toString());

    }
}
