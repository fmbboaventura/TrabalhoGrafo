package br.uefs.grafo;

import java.util.LinkedList;

/**
 * Created by Filipe Boaventura on 13/04/2016.
 */
public class Vertice {
    String nome;
    LinkedList<Aresta> arestas;

    public Vertice(String nome) {
        this.nome = nome;
        arestas = new LinkedList<>();
    }

    public void criarAresta(Vertice destino, float peso) {
        arestas.add(new Aresta(this, destino, peso));
    }
}
