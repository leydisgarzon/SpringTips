package leydis.spring.ioc;

/**
 * Created by ley on 25/10/2016.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach() {
        System.out.println("Inside no-arg CricketCoach's constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside CricketCoach's setter method");
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        System.out.println("Inside eetEmail CricketCoach method");
        this.email = email;
    }

    public void setTeam(String team) {
        System.out.println("Inside setTeam CricketCoach method");
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public String getDailyWorkout() {
        return "Practice for 15 min";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
