package ex_18_OOPs_Constructor;

public class Lab179_PC_Constructor_Overloading {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.run();
        Student s2=new Student("Shyam","1",1);
        s2.run();
    }

}

class Student
{
    String name;
    String ID;
    int grade;

    Student()
    {
        name="null";
        ID="null";
        grade=5;
    }

    Student(String name1,String ID1,int grade1)
    {
        this.name=name1;
        this.ID=ID1;
        this.grade=grade1;
    }
    Student(String name2,String ID2)
    {
        this.name=name2;
        this.ID=ID2;

    }

    void run()
    {
        System.out.println(name+" is running");
    }
}

