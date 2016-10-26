package leydis.spring.ioc;

/**
 * Created by ley on 24/10/2016.
 */
public class BaseballCoach implements Coach{
    private FortuneService fortuneService;

    public BaseballCoach() {

    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){
        return "30 min";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return null;
    }

    public String getTeam() {
        return null;
    }


}
