package ex_29_Wrapper_Class;

public class Lab216_Wrapper {
    public static void main(String[] args) {

    }
}

class Mobile extends OldPhone
{
    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer Phone;
private String name;

}

class OldPhone implements SImCard
{
void calling()
{
    System.out.println("calling you!");
}

    @Override
    public void network() {
        System.out.println("5G network");
    }
}

interface SImCard
{
    static void ServiceProvider()
    {
        System.out.println("Airtel");
    }
    void network();
}