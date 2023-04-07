package satya.designpatterns.creational.builder;

public class PhoneBuyeer
{
    public static void main(String[] args)
    {
        Phone obj = new Phonebuilder().setOs("android").getPhone();
        System.out.println(obj);

    }
}
