package agaStupak;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Home home = Home.builder().Kitchen("kuchnia").Toilet("toaleta").LivingRoom("salon").build();
    }
}
