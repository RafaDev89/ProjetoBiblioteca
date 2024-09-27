package entities;

import java.util.ArrayList;

public class ArvoreDeLivros {
    private No raiz;

    public ArvoreDeLivros() {
        raiz = null;
    }

    // Método para inserir um nó com uma lista de livros
    public void inserir(ArrayList<String> livros) {
        if (livros != null && !livros.isEmpty()) {
            raiz = inserirRecursivo(raiz, livros);
        }
    }

    private No inserirRecursivo(No raiz, ArrayList<String> livros) {
        if (raiz == null) {
            return new No(livros);
        }

        // Comparar usando o primeiro livro da lista
        String primeiroLivro = livros.get(0);
        String primeiroLivroNoAtual = raiz.livros.get(0);

        if (primeiroLivro.compareTo(primeiroLivroNoAtual) < 0) {
            raiz.esquerda = inserirRecursivo(raiz.esquerda, livros);
        } else if (primeiroLivro.compareTo(primeiroLivroNoAtual) > 0) {
            raiz.direita = inserirRecursivo(raiz.direita, livros);
        }

        return raiz;
    }

    // Método para percorrer e listar os nós da árvore
    public void percorrerInOrder() {
        percorrerInOrderRecursivo(raiz, "Raiz");
    }

    private void percorrerInOrderRecursivo(No raiz, String posicao) {
        if (raiz != null) {
            percorrerInOrderRecursivo(raiz.esquerda, "Esquerda");
            
            System.out.println("Posição: " + posicao);
            System.out.println("Livros no nó: " + raiz.livros);
            
            percorrerInOrderRecursivo(raiz.direita, "Direita");
        }
    }
}
