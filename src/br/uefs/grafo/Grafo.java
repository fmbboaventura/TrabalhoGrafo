package br.uefs.grafo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Filipe Boaventura on 13/04/2016.
 */
public class Grafo {
    HashMap<String, Vertice> listaDeAdjacencia;

    public Grafo(int vertices) {
        this.listaDeAdjacencia = new HashMap<>(vertices);
    }

    public Grafo() {
        this.listaDeAdjacencia = new HashMap<>();
    }

    /**
     * Cria aresta de acordo com a orientação
     * @param origem
     * @param destino
     * @param peso
     * @param grafoOrientado - se o grafo é orientado ou não
     */
    public void criarAresta(String origem, String destino, float peso, boolean grafoOrientado){
        Vertice a, b;
        if(listaDeAdjacencia.containsKey(origem)) {
            a = listaDeAdjacencia.get(origem);
        } else {
            a = new Vertice(origem);
            listaDeAdjacencia.put(a.nome, a);
        }

        if(listaDeAdjacencia.containsKey(destino)) {
            b = listaDeAdjacencia.get(destino);
        } else {
            b = new Vertice(destino);
            listaDeAdjacencia.put(a.nome, a);
        }

        a.criarAresta(b, peso);

        if(!grafoOrientado) b.criarAresta(a, peso);
    }

    /**
     * Cria aresta não orientada
     * @param origem
     * @param destino
     * @param peso
     */
    public void criarAresta(String origem, String destino, float peso){
        this.criarAresta(origem, destino, peso, false);
    }

    public LinkedList<Vertice> getVertices() {
        return new LinkedList<>(listaDeAdjacencia.values());
    }
}
