package leydis.ioc;

import leydis.ioc.config.SpringConfig;
import leydis.ioc.interfaces.Course;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ley on 31/10/2016.
 */
public class PrimaryAnnotationApp {

    public static void main(String[] args) {
        //load the context config
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        /**** EnglishCourse ****/
        // retrieve EnglishCourse bean from the context
        Course oneCourse = applicationContext.getBean("javaCourse", Course.class);
        Course twoCourse = applicationContext.getBean("htmlCourse", Course.class);

        // using methods from EnglishCourse
        System.out.println("Course: "+oneCourse.getCourseName());
        System.out.println("Teacher: "+oneCourse.getTeacherName());

        System.out.println("\nCourse: "+twoCourse.getCourseName());
        System.out.println("Teacher: "+twoCourse.getTeacherName());

        //close the context
        applicationContext.close();
    }


}
