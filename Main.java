import java.util.Scanner;
//class Student
//{
//    String name="Meet";
//    int age=18;
//    int roll_no=31;
//}
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Student obj=new Student();
//        System.out.println("The Name is:"+obj.name);
//        System.out.println(obj.age);
//    }
//}

class Student
{
    String name="Meet";
    int age;
    int roll_no;
    void Student_Data(String s,int z,int x)
    {
        name=s;
        roll_no=z;
        age=x;
    }
    void display()
    {
        System.out.println("The Name is:"+name);
        System.out.println("The age is:"+age);
        System.out.println("The roll No is:"+roll_no);
    }
}

public class Main
{
    public static void main(String[] args) {

        Student obj=new Student();
        obj.Student_Data("Meet Kotadiya",18,31);
        obj.display();
        System.out.println();

        Student obj2=new Student();
        obj2.Student_Data("Harsh",19,12);
        obj2.display();

    }
}