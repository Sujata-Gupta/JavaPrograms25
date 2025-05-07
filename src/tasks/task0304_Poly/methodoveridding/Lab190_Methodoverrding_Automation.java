package tasks.task0304_Poly.methodoveridding;

public class Lab190_Methodoverrding_Automation {
    public static void main(String[] args) {
        CommonoToAll CA=new CommonoToAll();
        CA.openBrowser();
        CommonoToAll CH=new Chrome();
        CH.openBrowser();
        CommonoToAll FI=new firefox();
        FI.openBrowser();

    }
}
class CommonoToAll

{
    void openBrowser()
    {
        System.out.println("open IE");
    }
}
class Chrome extends CommonoToAll
{
    @Override
    void openBrowser() {
        System.out.println("open Chrome");
    }

}
class firefox extends CommonoToAll
{
    void openBrowser()
    {
        System.out.println("Firefox");
    }
}
