package ex_09_Switch;

public class JDK13andAbove {
    public static void main(String[] args) {

        int item=23;

        switch (item)
        {
            case 001 -> System.out.println("001");
            case 23 -> System.out.println("002");
            default -> System.out.println("default");
        }
    }
}
