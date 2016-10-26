package leydis.spring.ioc;

/**
 * Created by ley on 24/10/2016.
 */
public class ChessCoach implements Coach{

    public String getDailyWorkout() {
        return "40 min";
    }

    public String getDailyFortune() {
        return null;
    }

    public String getEmail() {
        return null;
    }

    public String getTeam() {
        return null;
    }
}
