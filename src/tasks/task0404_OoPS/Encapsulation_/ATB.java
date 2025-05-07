package tasks.task0404_OoPS.Encapsulation_;

public class ATB {
    private String Name;
    private String ID;
    private int phone;

    ATB(String Name,String ID,int phone)
    {
        this.Name=Name;
        this.ID=ID;
        this.phone=phone;

    }


    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    void tostring()
    {
        System.out.println(Name+" "+ID+" "+phone);
    }


}
