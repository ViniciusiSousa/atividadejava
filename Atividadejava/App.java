public class App {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

      
        linkedList.inserirOrdenado(10);
        linkedList.inserirOrdenado(5);
        linkedList.inserirOrdenado(20);
        linkedList.inserirOrdenado(15);

        
        System.out.println("Lista ordenada:");
        linkedList.traverse();  
    }
}

