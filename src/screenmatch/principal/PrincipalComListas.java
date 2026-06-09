package screenmatch.principal;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main(String[] args) {
        Filme meuFilme = new Filme("O tumulo dos vagalumes", 1988);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);
        Filme filmeDaMari = new Filme("Guerreiras do Kpop", 2024);
        filmeDaMari.avalia(6);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = meuFilme; // f1 aponta para o mesmo objeto que meu filme, não copia (é uma VARIAVEL DE REFERENCIA)

       List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDaMari);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
       // lista.forEach(item -> System.out.println(item)); - forma mais elegante
        for(Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme  && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Gabriel");
        buscaPorArtista.add("Cleber");
        buscaPorArtista.add("Fernando");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        System.out.println("Titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));   // Forma moderna
        System.out.println("Ordenando por ano de lançamento: " + lista);
        lista.sort(Comparator.comparing(Titulo::mediaDasAvaliacoes));
        System.out.println("Ordenando pela media de avaliações: " + lista);
    }
}
