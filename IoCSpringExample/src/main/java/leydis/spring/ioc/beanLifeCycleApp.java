package leydis.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ley on 24/10/2016.
 */
public class beanLifeCycleApp {

    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve the bean from the spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
