public class projectstudentclass {
     static class Student{
        String studentname;
        int rollno;
        double marks;
     public Student(String studentname , int rollno , double marks ){
        this.studentname = studentname;
        this.rollno = rollno;
        this.marks = marks;
        }

        
         public void print() {
             System.err.println("student name is :"+studentname);
             System.out.println("roll no is : "+rollno);
             System.out.println("student marks is :"+marks);
         }

         
        
    }
    public static void main(String[] args) {
       Student s1 = new Student("darash",2500,8.5);
       Student s2 = new Student("dhfsd",250,8.9); 
       Student s3 = new Student("dhadlj",25,8.0);
       s1.print();
       s2.print(); 
       s3.print(); 

    }

}