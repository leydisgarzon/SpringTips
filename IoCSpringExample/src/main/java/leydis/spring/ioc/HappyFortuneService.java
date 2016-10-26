package leydis.spring.ioc;

/**
 * Created by ley on 24/10/2016.
 */
public class HappyFortuneService implements FortuneService {

    public String getFortune() {
        return "Today is your lucky day";
    }
}
