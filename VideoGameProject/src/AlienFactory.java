import java.util.Random;

public class AlienFactory {
     enum AlienType{SquidAlien, MonkeyAlien, TigerAlien, RatAlien} ;
    private static Random r = new Random();

    public Alien getAlien() {
        int randomAlien = r.nextInt(AlienFactory.AlienType.values().length);
        AlienFactory.AlienType Alien1 = AlienFactory.AlienType.values()[randomAlien];
        Alien a = null;
        switch(Alien1) {
            case SquidAlien:
                a = new SquidAlien();
                break;
            case MonkeyAlien:
                a = new MonkeyAlien();
                break;
            case TigerAlien:
                a = new TigerAlien();
                break;
            case RatAlien:
                a = new RatAlien();
                break;
            default:
                a = new Alien("Unknown");
                break;
        }
        return a;

    }
}
