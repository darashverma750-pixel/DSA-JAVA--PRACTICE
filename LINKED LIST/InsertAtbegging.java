class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
    }
}

class linklisted {
    node head;
    node tail;
    int size = 0;

    public void InsertAtend(int x) {
        node newnode = new node(x);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
        size++;   // ✅ increment size
    }

    public void InsertAtbegging(int y) {
        node newnNode = new node(y);
        if (head == null) {
            head = tail = newnNode;
        } else {
            newnNode.next = head;
            head = newnNode;
        }
        size++;   // ✅ increment size
    }

    public void insert(int x, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("invalid idx");
        } else if (idx == 0) {
            InsertAtbegging(x);
        } else if (idx == size) {
            InsertAtend(x);
        } else {
            node temp = head;
            // ✅ stop at node before idx
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            node t = new node(x);
            t.next = temp.next;
            temp.next = t;
            size++;   // ✅ increment size
        }
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("the size of the linklist : " + size);
    }
    public void search(int val) {
         node temp = head;
         boolean flag = false;
         while(temp!=null){
         if(temp.data == val){
         System.out.println(val+" value found "); flag = true;
         break; 
    }
        temp = temp.next;
  }  
  if(!flag){
    System.out.println(val+"not found");
  }
    
}
public void delete(int idx) {
     if (idx < 0 || idx > size) {
     System.out.println("invalid idx");
    node temp = head;
    for(int i = 0; i <= idx - 1;i++){
        temp = temp.next;
    }
    temp.next = temp.next.next;
    if(idx == size - 1) tail = temp;
    size--;
}
}
}

public class InsertAtbegging {
    public static void main(String[] args) {
        linklisted link = new linklisted();

        // Initial nodes manually
        link.head = new node(10);
        node secnode = new node(20);
        node third = new node(30);
        link.head.next = secnode;
        secnode.next = third;
        link.tail = third;
        link.size = 3;   // ✅ manually set size

        // Add more nodes
        link.InsertAtend(40);
        link.InsertAtend(50);
        link.InsertAtend(60);

        // Insert at index
        link.insert(100, 3);

        // Display
        link.display();
        link.search(50);
        link.delete(2);
        link.display();
    }
}
