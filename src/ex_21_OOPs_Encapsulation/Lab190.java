package ex_21_OOPs_Encapsulation;

public class Lab190 {
    public static void main(String[] args) {
        ICICIBank IC=new ICICIBank();
        IC.setBalance(454474);
        System.out.println(IC.getBalance());
    }
}
class ICICIBank {
private String name;
  private int balance;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

