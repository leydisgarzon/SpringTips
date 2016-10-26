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
        Coach theCoach = context.getBean("myCricketCoach",Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        // close the context
        context.close();

    }
}
