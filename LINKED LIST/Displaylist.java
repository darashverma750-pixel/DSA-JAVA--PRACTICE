
public class Displaylist {
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        node.display(a);   // Call the static method
    }
}
