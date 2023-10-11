import java.util.Random;

public class BetterAlienFactory {
    enum AlienType{SquidAlien, MonkeyAlien, TigerAlien, RatAlien} ;
    private static Random r = new Random();

    public Alien getAlien() {
        int randomAlien = r.nextInt(BetterAlienFactory.AlienType.values().length);
        BetterAlienFactory.AlienType Alien1 = BetterAlienFactory.AlienType.values()[randomAlien];
        Alien alien = null;
        try {
            alien =
                    (Alien)(Class.forName(Alien1.toString()).getDeclaredConstructor().newInstance());

        }catch (Exception e) {
            System.out.println("Unknown Alien Type");
        }
        return alien;

    }
}
