package tasks;

public class Task1403_CLI_input {
    public static void main(String[] args) {

        String name= args[2] ;
        int age = Integer.parseInt(args[0]);
        int salary = Integer.parseInt(args[1]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
