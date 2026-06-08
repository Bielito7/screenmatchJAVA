package screenmatch.principal;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;

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

        ArrayList<Titulo> lista = new ArrayList<>();
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
    }
}
