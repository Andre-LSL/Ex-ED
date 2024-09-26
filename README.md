  Anotação de uma possivel forma de já adicionar em ordem alfabetica a lista encadeada (falta ajustar o nome de algumas variaveis e realizar testes)
  
    public void append(String nome) {
        Character letra = Character.valueOf(nome.charAt(0));

        NoDuplo buffer = new NoDuplo(nome, letra);
        // Se a lista estiver vazia, insere o primeiro nó
        if (this.inicio == null) {
            head = newNode;
            return;
        }
        // Se o novo nó deve ser inserido antes do head atual
        if (data.compareTo(head.data) <= 0) { 
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        // Percorrer a lista para encontrar a posição correta
        Node current = head;
        while (current.next != null && current.next.data.compareTo(data) < 0) {
            current = current.next;
        }



