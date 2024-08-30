public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void inserirOrdenado(int data) {
        Node novoNo = new Node(data);
        if (head == null || head.data >= novoNo.data) {
            novoNo.next = head;
            head = novoNo;
        } else {
            Node atual = head;
            while (atual.next != null && atual.next.data < novoNo.data) {
                atual = atual.next;
            }
            novoNo.next = atual.next;
            atual.next = novoNo;
        }
    }

    
    public void traverse() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.data + " ");
            atual = atual.next;
        }
        System.out.println();
    }
}
