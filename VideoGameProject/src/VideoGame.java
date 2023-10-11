import java.util.Random;

public class VideoGame {
    private static final int ALIEN = 10;
    public void play(){
        //create an array of 10 aliens and print them.
        Alien[] a = new Alien [ALIEN];
        AlienFactory v = new AlienFactory();
        for( int i =0 ; i< a.length; ++i) {
            a[i] = v.getAlien();
        }
        for( int i = 0; i< a.length; ++i) {
            System.out.println(a[i]);
        }

    }
}
