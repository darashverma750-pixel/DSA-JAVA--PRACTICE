class node{
    int data;
    node next;

    public node(int data) {
        this.data = data;
    }
}
class linklist{
    node head;
    node tail;
         void search(int val) {
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
    
}    

public class search {
    public static void main(String[] args) {
    linklist l1 = new linklist();
     l1.head = new node(10);
     node second = new node(20);
     node third = new node(30);
     l1.head.next =  second;
     second.next = third;
     l1.tail = third;
        


        l1.search(20);
    }
    
}
