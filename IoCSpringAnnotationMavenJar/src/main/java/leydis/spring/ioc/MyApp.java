package leydis.spring.ioc;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ley on 27/10/2016.
 */
public class MyApp {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Course courseOne = context.getBean("myEnglishCourse",Course.class);
        Course courseTwo = context.getBean("javaCourse",Course.class); // the bean's name is the class name
        System.out.println(courseOne.getCourseName() + ". Teacher: " + courseOne.getTeacherName());
        System.out.println(courseTwo.getCourseName() + ". Teacher: " + courseTwo.getTeacherName());*/
        System.out.println("Entre una cadena");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String entry="";
        try {
            entry = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("la cadena entrada es: " + entry);
       // context.close();
    }
}
