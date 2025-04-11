package ex_09_Switch;

public class JDK13andAbove1 {
    public static void main(String[] args) {

        int item = 202;

        switch (item) {
            case 101, 102, 103:
                System.out.println("this is A");
                break;
            case 201, 202, 203:
                System.out.println("This is B");
                break;
            default:
                System.out.println("nothing");

        }
    }
}
