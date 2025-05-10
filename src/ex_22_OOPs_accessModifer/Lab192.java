package ex_22_OOPs_accessModifer;

public class Lab192 {

}
class Father
{
    private int gold=10;
    protected int silver=10;
}
class Son extends Father
{
    void accessS()
    {
        System.out.println(silver);
        //System.out.println(gold);
    }
}
