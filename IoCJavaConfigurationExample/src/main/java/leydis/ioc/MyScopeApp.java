package leydis.ioc;

import leydis.ioc.config.SpringConfig;
import leydis.ioc.courseImplementations.EnglishCourse;
import leydis.ioc.courseImplementations.JavaCourse;
import leydis.ioc.courseImplementations.PHPCourse;
import leydis.ioc.interfaces.Course;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ley on 31/10/2016.
 */
public class MyScopeApp {

    public static void main(String[] args) {
        //load the context config
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        /**** EnglishCourse ****/
        // retrieve EnglishCourse bean from the context
        EnglishCourse oneEnglishCourse = applicationContext.getBean("englishCourse", EnglishCourse.class);
        EnglishCourse twoEnglishCourse = applicationContext.getBean("englishCourse", EnglishCourse.class);

        // using methods from EnglishCourse
        System.out.println("Both Courses are the same object: "+ (oneEnglishCourse == twoEnglishCourse));
        System.out.println("Course One: "+ oneEnglishCourse);
        System.out.println("Course Two: "+ twoEnglishCourse);

        //close the context
        applicationContext.close();
    }


}
