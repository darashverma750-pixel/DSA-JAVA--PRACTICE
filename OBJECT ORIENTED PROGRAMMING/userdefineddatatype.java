public class userdefineddatatype {
    public static class student{
        String name;
        int rollno;
        double cgpa;
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "manyak";
        s1.rollno = 24;
        s1.cgpa = 8.54;

        student s2 = new student();
        s2.name = "harsh";
        s2.rollno = 24;
        s2.cgpa = 8.69;
        System.err.println(s1.name+" "+s1.rollno+" "+s1.cgpa);
        System.err.println(s2.name+" "+s2.rollno+" "+s2.cgpa);

    }
   
}
