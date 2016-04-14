package br.uefs.grafo;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Grafo grafo;
        BufferedReader reader = new BufferedReader(new FileReader(new File("grafo.txt")));

        int qtdVertices = Integer.parseInt(reader.readLine());
        grafo = new Grafo(qtdVertices);

        for (int i = 0; i < qtdVertices+1; i++) { // pulando linhas
            reader.readLine();
        }

        String line;
        String[] aux;
        while ((line = reader.readLine()) != null){
            aux = line.split(",");
            grafo.criarAresta(aux[0], aux[1], Float.parseFloat(aux[2]));
        }

        // Testando
        for (String key : grafo.listaDeAdjacencia.keySet()) {
            System.out.println("Vertice: " + key);
            Vertice v = grafo.listaDeAdjacencia.get(key);
            for (Aresta a : v.arestas){
                System.out.println("Destino: " + a.destino.nome
                        + " Peso: " + a.peso);
            }
        }
    }
}
