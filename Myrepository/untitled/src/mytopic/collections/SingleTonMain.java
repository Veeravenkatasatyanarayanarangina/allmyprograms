package mytopic.collections;

public class SingleTonMain
{
    public static void main(String[] args) {
        SingleTon x = SingleTon.singleTon();
        SingleTon y = SingleTon.singleTon();
        SingleTon z = SingleTon.singleTon();

        x.s = x.s.toUpperCase();
        System.out.println(x.s);
        System.out.println(y.s);


    }
}
