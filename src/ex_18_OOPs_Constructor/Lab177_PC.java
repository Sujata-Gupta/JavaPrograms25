package ex_18_OOPs_Constructor;

public class Lab177_PC {
    public static void main(String[] args) {
        bike b1=new bike();
        bike b2=new bike("y","sd",32);


    }
}
class bike
{
    String name;
    String Model;
    int year;

   bike()
   {
       name="x";
       Model="y";
       year=1221;
       System.out.println(name+" "+Model+" "+year);
   }
   bike(String name1,String Model1,int year1)
   {
       this.name=name1;
       this.Model=Model1;
       this.year=year1;
       System.out.println(name+" "+Model+" "+year);

   }
}
