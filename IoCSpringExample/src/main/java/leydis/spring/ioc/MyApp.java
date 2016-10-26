package leydis.spring.ioc;

/**
 * Created by ley on 24/10/2016.
 */
public class MyApp {
    public static void main(String[] args) {
        Coach myCoach = new BaseballCoach();
        System.out.println(myCoach.getDailyWorkout());

        Coach myCoach2 = new TrackCoach();
        System.out.println(myCoach2.getDailyWorkout());
    }
}
