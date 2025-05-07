package ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {
        vmoLogin lg=new vmoLogin();
        lg.setPassword("234234e",true);
        lg.setUsername("Ansh");
        String x=lg.getUsername();
        System.out.println(x);

    }
}
class vmoLogin
{
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin==true)
        {
            this.password=password;
            System.out.println(password);
            System.out.println("password reset done");
        }
        else
        {
            System.out.println("not allowed");
        }
    }

//    public void setPassword(String password,boolean isAdmin)
//    {
//
//    }



}