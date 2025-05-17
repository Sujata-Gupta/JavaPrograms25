package ZPractice_JavaCoding;

public class star {
    public static void main(String[] args) {
   for(int i=0;i<5;i++)
   {

       for (int k=i;k<5;k++)
       {

           System.out.print(" ");
       }
       for(int j=i+1;j<6;j++)
       {
           System.out.print("*");
       }
       System.out.println();
   }

    }
}
