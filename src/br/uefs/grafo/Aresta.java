package br.uefs.grafo;

/**
 * Created by Filipe Boaventura on 13/04/2016.
 */
public class Aresta {

    Vertice origem;
    Vertice destino;
    float peso;

    public Aresta(Vertice origem, Vertice destino, float peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public Vertice getDestino() {
        return destino;
    }
    
    
}
