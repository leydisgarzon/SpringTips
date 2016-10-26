package leydis.spring.ioc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by ley on 25/10/2016.
 */
public class RandomFortuneService implements FortuneService {
    String[] fortunes = {"Today is a lucky day for you","Today is a regular day for you","Today is a nightmare day for you"};
    public String getFortune() {
        return fortunes[new Random().nextInt(fortunes.length)];
    }
}
