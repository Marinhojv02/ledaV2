package ListaEncadeada;

public class LinkedList {

    Node head;

    public LinkedList (){
    }

    public void add(Node newNode){
        if(this.head == null){
            this.head = newNode;
        }else{
            newNode.setNextNode(this.head);
            this.head = newNode;
        }
    }
    public void add(int nodeValue){
        Node newNode = new Node(nodeValue);

        if(this.head == null){
            this.head = newNode;
        }else{
            newNode.setNextNode(this.head);
            this.head = newNode;
        }
    }

    public void sortList(){
        this.head = mergeSort(this.head);
    }

    public Node mergeSort(Node first) {
        if (first == null || first.getNextNode() == null) {
            return first;
        }

        Node temp = first;
        Node fast = first;
        Node slow = first;

        while (fast != null && fast.getNextNode() != null){
            temp = slow;
            fast = fast.getNextNode().getNextNode();
            slow = slow.getNextNode();
        }

        temp.setNextNode(null);

        Node left_side = mergeSort(first);
        Node right_side = mergeSort(slow);

        return merge(left_side, right_side);
    }

    public Node merge(Node left_side, Node right_side){
        Node sorted_temp = new Node(0);
        Node current_node = sorted_temp;

        while (left_side != null && right_side != null){
            if(left_side.getValue() < right_side.getValue()){
                current_node.setNextNode(left_side);
                left_side = left_side.getNextNode();
            }
            else{
                current_node.setNextNode(right_side);
                right_side = right_side.getNextNode();
            }

            current_node = current_node.getNextNode();
        }

        if(left_side != null){
            current_node.setNextNode(left_side);
            left_side = left_side.getNextNode();
        }

        if(right_side != null){
            current_node.setNextNode(right_side);
            right_side = right_side.getNextNode();
        }

        return sorted_temp.getNextNode();


    }

    //prints array
    public void print(){
        if(this.head == null){
            System.out.println("Lista está vazia");
        }
        else{
            Node aux = head;
            while(aux!=null){
                System.out.print(aux.value + " -> ");
                aux = aux.getNextNode();
            }
        }
    }

}
