package entities;

import java.util.ArrayList;

public class No {
    ArrayList<String> livros; // Lista de títulos de livros no nó
    No esquerda, direita;

    public No(ArrayList<String> livros) {
        this.livros = livros;
        this.esquerda = null;
        this.direita = null;
    }

    public ArrayList<String> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<String> livros) {
        this.livros = livros;
    }
}
