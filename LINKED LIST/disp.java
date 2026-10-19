class Node{
    int data; 
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
class linklist{
    Node head;
    Node tail;
public void InsertAtend( int x) {
    Node newNode = new Node(x);
    if(head == null){
        head = tail = newNode;    
    }
    else{
        tail.next = newNode;
        tail = newNode;
    }
   }
   public void display() {
       Node temp = head;
    while(temp!=null){
        System.out.println(temp.data+" ");
        temp = temp.next;
      }
    System.out.println("");            
    }    
}

public class disp {
    public static void main(String[] args) {
    linklist list = new linklist();
    list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        list.head.next = second;
        second.next = third;

        // Update tail reference
        list.tail = third;
    list.InsertAtend(40);
    list.display();


    }
}
