package leydis.ioc;

import leydis.ioc.courseImplementations.EnglishCourse;
import leydis.ioc.courseImplementations.JavaCourse;
import leydis.ioc.courseImplementations.PHPCourse;
import leydis.ioc.interfaces.Course;
import leydis.ioc.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ley on 31/10/2016.
 */
public class MyApp {

    public static void main(String[] args) {
        //load the context config
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        /**** EnglishCourse ****/
        // retrieve EnglishCourse bean from the context
        EnglishCourse myEnglishCourse = applicationContext.getBean("englishCourse", EnglishCourse.class);

        // using methods from EnglishCourse
        System.out.println("Course: "+myEnglishCourse.getCourseName());
        System.out.println("Teacher: "+myEnglishCourse.getTeacherName());
        System.out.println("Teacher age: "+myEnglishCourse.getTeacher().getAge());

        /**** JavaCourse ****/
        // retrieve JavaCourse bean from the context
        Course myJavaCourse = applicationContext.getBean("javaCourse", JavaCourse.class);

        // using methods from JavaCourse
        System.out.println("Course: "+myJavaCourse.getCourseName());
        System.out.println("Teacher: "+myJavaCourse.getTeacherName());

        /**** PHPCourse****/
        // retrieve JavaCourse bean from the context
        Course myPhpCourse = applicationContext.getBean("phpCourse", PHPCourse.class);

        // using methods from JavaCourse
        System.out.println("Course: "+myPhpCourse.getCourseName());
        System.out.println("Teacher: "+myPhpCourse.getTeacherName());

        //close the context
        applicationContext.close();
    }


}
