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

    //method used in the init-method of the TrackCoach bean in the beanLifeCycle-applicationContext
    //must be "public void" method and without args
    public void whenBeanCreation() {
        System.out.println("Init TrackCoach bean method");
    }

    //method used in the destroy-method of the TrackCoach bean in the beanLifeCycle-applicationContext
    //must be "public void" method and without args
    //this method will not be call for a bean prototype scope
    public void beforeBeanDestroy() {
        System.out.println("Destroy TrackCoach bean method");
    }
}
