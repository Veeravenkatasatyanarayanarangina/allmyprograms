package assignment3;
abstract class Instrument
{
    abstract void play();
}
class Piano extends Instrument
{

    @Override
    void play()
    {
        System.out.println(" Piano is playing tan tan tan ");
    }
}
class Flute extends  Instrument
{

    @Override
    void play()
    {
        System.out.println(" Flute is playing toot toot toot");
    }
}
class Guitar extends Instrument
{

    @Override
    void play()
    {
        System.out.println(" Guitar is palying tin tin tin .....");

    }
}




public class Assignment7
{
    public static void main(String[] args)
    {
        Instrument i1 = new Flute();
        i1.play();
        i1 = new Guitar();
        i1.play();
        i1 = new Piano();
        i1.play();


    }

}
