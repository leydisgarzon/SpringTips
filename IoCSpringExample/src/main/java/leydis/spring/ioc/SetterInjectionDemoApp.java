package leydis.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ley on 25/10/2016.
 */
public class SetterInjectionDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from the spring container
        Coach theCricketCoach = context.getBean("myCricketCoach",Coach.class);
        Coach otherCricketCoach = context.getBean("myCricketCoach",Coach.class);

        Coach theTrackCoach = context.getBean("myCoach",Coach.class);
        Coach otherTrackCoach = context.getBean("myCoach",Coach.class);

        // call methods on the bean
        System.out.println(theCricketCoach.getDailyWorkout());
        System.out.println(theCricketCoach.getDailyFortune());
        System.out.println(theCricketCoach.getEmail());
        System.out.println(theCricketCoach.getTeam());

                //testing scope
        System.out.println("Retrieve the same object CricketCoach? " + (theCricketCoach == otherCricketCoach) + " " + theCricketCoach + " != " + otherCricketCoach);
        System.out.println("Retrieve the same object TrackCoach? " + (theTrackCoach == otherTrackCoach) + " " + theTrackCoach + " = " + otherTrackCoach);

        // close the context
        context.close();

    }
}
