class node{
    int data;
    node next;
node(int data){
    this.data = data;
}
}
class linklisted{
    node head;
    node tail;
public  void InsertAtend(int x) {
    node newNode = new node(x);
    if (head == null){
        head = tail = newNode;
    }
    else{
        tail.next = newNode;
        tail = newNode;
    }
}
public void display() {
    node temp = head;
    while(temp!= null){
      System.out.print(temp.data+" ");
        temp = temp.next;
    }
    
}    
}
public class dispal {
    public static void main(String[] args) {
        linklisted link = new linklisted();
        link.head = new node(10);
        node secnode = new node(20);
        node third = new node(30);
        link.head.next = secnode;
        secnode.next = third;
        link.tail = third;
       link.InsertAtend(10);
       link.InsertAtend(20);
       link.InsertAtend(30);
       link.display();
        
    }
}
