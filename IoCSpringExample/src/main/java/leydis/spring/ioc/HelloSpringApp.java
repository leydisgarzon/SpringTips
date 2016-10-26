package leydis.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ley on 24/10/2016.
 */
public class HelloSpringApp {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from the spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

        /*System.out.println(Integer.parseInt("0101",2));
        System.out.println(Integer.parseInt("1001",2));
        System.out.println(Integer.parseInt("0101",2)| 9);*/
       // System.out.println(false | false);
        //System.out.println(false || false);
    }
}
