package model;

import org.w3c.dom.Node;

public class ListaEncadeadaDupla {
    private NoDuplo inicio = null;
    private NoDuplo fim = null;
    private int total;


    public void append(String nome) {
        Character letra = Character.valueOf(nome.charAt(0)); // Pega a primeira letra do nome e salva em Character, pois aceita null.
        NoDuplo buffer = new NoDuplo(nome, letra); // cria o no, com o nome a ser enviado para lista simples e a letra que será salva no no da lista dupla

        }

    public int indexDupla(Character elemento) throws IllegalArgumentException{ // Descobre onde está localizado a o nó referente a letra enviada
        if (this.inicio == null)
            throw new IllegalArgumentException("Não existe item na lista");
        int index = 0;
        if (this.inicio.getLetra() == elemento)
            return index;
        NoDuplo buffer = this.inicio;
        do {
            if( buffer.getLetra() == elemento){
                return index;
            }
            buffer = buffer.getProximoDuplo();
            index++;
        } while(buffer != null);
        throw new IllegalArgumentException("Item não encontrado");
    }

    public void removeDupla(int index){ // remove o no com base no index
        if(index == 0){
            this.inicio.setLetra(null);
            this.inicio.setAnterior(null);
            if(this.inicio.getProximoDuplo() == null){
                this.inicio = null;
            } else {
                NoDuplo buffer = this.inicio.getProximoDuplo();
                this.inicio.setProximoDuplo(null);
                this.inicio = buffer;
            }
            return;
        }
        NoDuplo buffer_anterior = this.get(--index);
        NoDuplo item = buffer_anterior.getProximoDuplo();
        NoDuplo buffer_proximo = item.getProximoDuplo();
        buffer_anterior.setProximoDuplo(buffer_proximo);
        item.setProximoDuplo(null);
        item.setLetra(null);
        
        setTotal( --total );
    }
}
