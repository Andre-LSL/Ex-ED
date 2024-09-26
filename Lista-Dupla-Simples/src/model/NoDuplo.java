package model;
import model.ListaEncadeadaSimples;

public class NoDuplo {
    private Character letra;
    private String nome;
    private NoDuplo proximo;
    private NoDuplo anterior;
    private ListaEncadeadaSimples listaSimples = new ListaEncadeadaSimples();

    public NoDuplo(String nome, Character letra) {
        this.letra = letra;
        this.proximo = null;
        listaSimples.append(nome);
    }

    public Character getLetra() {
        return letra;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }

    public NoDuplo getProximoDuplo(){
		return proximo;
	}
	
	public void setProximoDuplo(NoDuplo proximo){
		this.proximo = proximo;
	}
	
	public NoDuplo getAnterior(){
		return anterior;
	} 
	
	public void setAnterior(NoDuplo anterior){
		this.anterior = anterior;
	}

    public void setNomeDuplo(String nome) {
        listaSimples.append(nome);
    }

    public void removerNome(String nome) {
        int index = listaSimples.index(nome);
        listaSimples.remove(index, nome);
    }

}
