public class lab_program_1
{
//    public static class Student
//    {
//        String Name;
//        int age;
//        void display(String x,int y)
//        {
//            Name=x;
//            age=y;
//            System.out.println("Name of the student is:"+Name);
//            System.out.println("Age is:"+age);
//        }
//
//    }
//    public static class Employee
//    {
//        String emp_name;
//        int Sal;
//
//        void display(String a,int b)
//        {
//            emp_name=a;
//            Sal=b;
//            System.out.println("The Name ot the employee is:"+emp_name);
//            System.out.println("The salary of the employee is:"+Sal);
//        }
//
//    }
////    public static void main(String[] args) {
//
////
////
////    }
//
//   public static class Employee1
//    {
//        static String name="Meet";
//        static int emp_id=200;
//        int emp_count=500;
//        static class department
//        {
//            public void show()
//            {
//                System.out.println("employee id is:"+emp_id);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Employee1.department e1=new Employee1.department();
//        e1.show();
//        Student s1=new Student();
//        Employee e=new Employee();
//
//
//        s1.display("Meet",19);
//        e.display("Mlon Eusk",100000);
//    }

    public static class Student
    {
        public Student(String Name,int age)
        {
            System.out.println("The name of the student is:"+Name);
            System.out.println("The age of the Student is:"+age);
        }
        int std_id;
        void disp(int x)
        {
            std_id=x;
            System.out.println("Student id is:"+std_id);
        }
    }

    public static void main(String[] args) {
        Student s1=new Student("Meet",19);
        s1.disp(31);
    }
}