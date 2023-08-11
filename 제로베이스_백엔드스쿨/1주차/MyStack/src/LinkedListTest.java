class Node{
    int data;
    Node next;

    Node(){

    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

class LinkedList{
    Node head;

    LinkedList() {}
    LinkedList(Node node){
        this.head = node;
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }else{
            return false;
        }
    }

    public void addData(int data){
        if(this.head == null){
            this.head = new Node(data, null);
        }else{
            Node cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }

    public void removeData(){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        Node cur = this.head;
        Node prev = cur;

        while(cur.next != null){
            prev = cur;
            cur = cur.next;
        }
        if(cur == this.head){
            this.head = null;
        }else{
            prev.next = null;
        }
    }

    public void findData(int data){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        Node cur = this.head;
        while(cur != null){
            if(cur.data == data){
                System.out.println("Data Exist");
                return;
            }
            cur = cur.next;
        }
        System.out.println("Data not found");
    }

    public void printData(){
        if(this.isEmpty()){
            System.out.println("List is Empty");
            return;
        }

        Node cur = this.head;
        while(cur != null){
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

public class LinkedListTest {
    public static void main(String[] args) {

    }
}
