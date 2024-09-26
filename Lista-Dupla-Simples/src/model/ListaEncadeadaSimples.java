package model;
import model.ListaEncadeadaDupla;
import model.NoSimples;

public class ListaEncadeadaSimples {
        private NoSimples inicio = null;
        private ListaEncadeadaDupla metodos = new ListaEncadeadaDupla();
        public void append(String nome) {
            NoSimples buffer = new NoSimples(nome);
            if(this.inicio == null) {
                this.inicio = buffer;
            } else {
                this.last().SetProximo(buffer);
            }
        }

        public NoSimples get (int index) throws IllegalArgumentException{
			int i = 0;
			if (this.inicio == null) 
				throw new IllegalArgumentException("Nao existe item na lista.");
			NoSimples buffer = this.inicio;
			for(i = 0; i < index; i++){
				if(buffer.GetProximo() == null)
					break;
				buffer = buffer.GetProximo();
			}
			if(i < index)
				throw new IllegalArgumentException("O indice informado não existe");
			return buffer;
		}

        public int index(String elemento) throws IllegalArgumentException{
			if (this.inicio == null)
				throw new IllegalArgumentException("Não existe item na lista");
			int index = 0;
			if (this.inicio.GetNome() == elemento)
				return index;
			NoSimples buffer = this.inicio;
			do {
				if( buffer.GetNome() == elemento){
					return index;
				}
				buffer = buffer.GetProximo();
				index++;
			} while(buffer != null);
			throw new IllegalArgumentException("Item não encontrado");
		}

        public void remove(int index, Character nome){
			if(index == 0){
				this.inicio.setNome(null);
				if(this.inicio.GetProximo() == null){
					this.inicio = null;
                    int valorRemover = metodos.indexDupla(nome); // caso não tenha mais valores na lista simples, chama a remoção  da lista dupla
                    metodos.removeDupla(valorRemover);
				} else {
					NoSimples buffer = this.inicio.GetProximo();
					this.inicio.SetProximo(null);
					this.inicio = buffer;
				}
				return;
			}
			NoSimples buffer_anterior = this.get(--index);
			NoSimples item = buffer_anterior.GetProximo();
			NoSimples buffer_proximo = item.GetProximo();
			buffer_anterior.SetProximo(buffer_proximo);
			item.SetProximo(null);
			item.setNome(null);
		}

        public NoSimples last() throws IllegalArgumentException {
            if(this.inicio == null) {
                throw new IllegalArgumentException ("Não existe item na lista");
            }
            NoSimples buffer = this.inicio;
            while(buffer.GetProximo() != null)
                buffer = buffer.GetProximo();
            return buffer;
        }
}
