package dataStructure;

public class LinkedList {
 // A lista encadeada tem a cabeça = head, calda = tail e o tamanho = length
    private Node head;

    private Node tail;

    private int length;

    class Node {
        String data;

        Node next;

        Node(String data){
            this.data = data;
        }
    }

    public LinkedList(String data){
        length = 1;
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
    }

    // CABEÇA DA LISTA
    public void getHead() {
        if (this.head == null){
            System.out.println("Lista Vazia");
        } else
            System.out.println("Head: " + head.data);
    }

    // FINAL DA LISTA OU CAUDA DA LISTA
    public void getTail() {
        if (this.tail == null){
            System.out.println("Lista Vazia");
        } else
            System.out.println("Tail: " + tail.data);
    }

    // TAMANHO DA LISTA
    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    // LIMPANDO A LISTA
    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
    }

    // PRINTANDO A LISTA
    public void print(){
        System.out.println("######################################");
        Node temp = this.head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("######################################");
    }


    // ADICIONANDO ELEMENTO NA LISTA
    public void append(String data){
        Node newNode = new Node(data);
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // REMOVENDO O ULTIMO DA LISTA
    public Node removeLast(){
        if (length == 0) return null;
        Node pre = head;
        Node temp = null;

        while (pre.next != tail){
            pre = pre.next;
        }

        temp = tail;
        tail = pre;
        tail.next = null;

        length--;
        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;
    }

    // ADICIONANDO ELEMENTO NO COMEÇO DA LISTA
    public void prePend(String data){
        Node newNode = new Node(data);
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    // REMOVENDO O PRIMEIO ELEMENTO DA LISTA
    public Node removeFirst(){
        if (length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;

    }

    // GET DE UM ELEMENTO ESPECIFICO DA LISTA
    public Node get(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp;
    }

    // INSERIR UM ELEMENTO NUM LIGAR ESPECIFICO

    public boolean insert(int index, String data){
        if (index < 0 || index > length) return false;
        if (index == 0){
            prePend(data);
            return true;
        }
        if (index == length){
            append(data);
            return true;
        }

        Node newNOde = new Node(data);
        Node temp = get(index -1);
        newNOde.next = temp.next;
        temp.next = newNOde;
        length++;
        return true;
    }

    // SETANDO UM NOVO VALOR PARA UM ELEMENTO JÁ EXISTENTE NA LISTA
    public boolean set(int index, String data){
        Node temp = get(index);
        if (temp != null){
            temp.data = data;
            return true;
        }
        return false;
    }

    // REMOVENDO UM ELEMENTO DA LISTA
    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if(index == length -1) return removeLast();

        Node prev = get(index -1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length --;

        return temp;
    }


    public static void main(String[] args){
        LinkedList list = new LinkedList("Elemento 1");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.prePend("Elemento 0");

        list.remove(2);
        list.print();

//        list.insert(3, "elemento 2.5");

//        System.out.println(list.get(2).data);
//        list.print();
//
//        list.set(1, "elemento 0.5");
//        list.print();

//        System.out.println(list.removeFirst().data);
//        list.print();

//
//
//        list.getHead();
//        list.getTail();
//        list.getLength();
//        list.print();
    }
}
