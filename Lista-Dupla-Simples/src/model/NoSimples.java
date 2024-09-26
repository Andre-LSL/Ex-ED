package model;

public class NoSimples {
    private String nome;
    private NoSimples proximo;

    public NoSimples (String nome) {
        this.nome = nome;
        this.proximo = null;
    }

    public NoSimples(String nome, NoSimples proximo) {
        this.nome = nome;
        this.proximo = proximo;
    }

    public String GetNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NoSimples GetProximo () {
        return proximo;
    }

    public void SetProximo(NoSimples proximo) {
        this.proximo = proximo;
    }

}
