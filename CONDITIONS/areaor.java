import java.util.Scanner;
public class areaor {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("ENTER THE LENGTH :");
int l = sc.nextInt();
System.out.print("ENTER THE BREATH :");
int b = sc.nextInt();
int a  = l * b;
int p = 2 *(l+b);
if (a > p)
{ 
    System.out.println("lenth is greater ");
}
else 
{
    System.err.println("breath is the greater ");
}
    }
}