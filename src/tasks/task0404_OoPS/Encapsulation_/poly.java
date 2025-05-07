package tasks.task0404_OoPS.Encapsulation_;

public class poly {
    public static void main(String[] args) {
        School s=new School();
        s.SchoolName();
        s.SchoolName("DPS");
        SchoolBranch s1=new SchoolBranch();
        s1.SchoolName();
        School s3=new SchoolBranch();
        s3.SchoolName();
    }
}

class School
{
    //overloading
    void SchoolName()
    {
        System.out.println("This is head branch");
    }

    void SchoolName(String Name)
    {
        System.out.println("This is Ashok nagar branch " + Name);
    }

}
class SchoolBranch extends School
{
    void SchoolName()
    {
        System.out.println("This is MG Road");
    }
}
