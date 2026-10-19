public class Node {
        int data;
        Node next;
        Node head;
        Node tail;

    public Node(int data) {
        this.data = data;
    }
  
    public static void display(Node head) {
       Node temp = head;
    while(temp!=null){
        System.out.println(temp.data+" ");
        temp = temp.next;
    }            
    }
        
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        Node.display(a);
    }
    
}
