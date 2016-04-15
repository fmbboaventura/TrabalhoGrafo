package br.uefs.grafo;

import java.util.LinkedList;

/**
 * Created by Filipe Boaventura on 13/04/2016.
 */
public class Vertice implements Comparable{
    String nome;
    LinkedList<Aresta> arestas;
    private float distancia;
    Vertice pai;

    public Vertice(String nome) {
        this.nome = nome;
        arestas = new LinkedList<>();
    }

    public void criarAresta(Vertice destino, float peso) {
        arestas.add(new Aresta(this, destino, peso));
    }
    
    public float pesoAte(Vertice v1){
        float peso = 0;
        for (Aresta aux: arestas){
            if (aux.getDestino().equals(v1)){
                peso = aux.getPeso();
            }            
        }
        return peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertice vertice = (Vertice) o;

        return nome != null ? nome.equals(vertice.nome) : vertice.nome == null;

    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }

    public LinkedList<Aresta> getArestas() {
        return arestas;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public Vertice getPai() {
        return pai;
    }

    public void setPai(Vertice pai) {
        this.pai = pai;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Vertice)) throw new IllegalArgumentException("O objeto "
                + o.toString() + " não é um vertice");
        Vertice v = (Vertice) o;

        if(this.getDistancia() > v.getDistancia()) return 1;
        else if (this.getDistancia() < v.getDistancia()) return -1;
        return 0;
    }
}
