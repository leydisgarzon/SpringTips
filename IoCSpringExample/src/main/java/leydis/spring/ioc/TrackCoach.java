package leydis.spring.ioc;

/**
 * Created by ley on 24/10/2016.
 */
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "20 min";
    }

    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    public String getEmail() {
        return null;
    }

    public String getTeam() {
        return null;
    }
}
