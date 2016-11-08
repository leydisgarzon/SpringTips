package leydis.ioc.config;

import leydis.ioc.courseImplementations.EnglishCourse;
import leydis.ioc.courseImplementations.HTMLCourse;
import leydis.ioc.courseImplementations.JavaCourse;
import leydis.ioc.courseImplementations.PHPCourse;
import leydis.ioc.teacherImplementations.EnglishTeacher;
import leydis.ioc.teacherImplementations.JavaTeacher;
import leydis.ioc.teacherImplementations.PHPTeacher;
import org.springframework.context.annotation.*;

/**
 * Created by ley on 31/10/2016.
 */
@Configuration
@PropertySource("teacher.properties")
@Lazy //@Lazy instantiates the object only when is needed instead of instantiate all objects when the context start up
public class SpringConfig {
    @Bean
    public EnglishTeacher englishTeacher(){
        return new EnglishTeacher();
    }

    @Bean
    public PHPTeacher phpTeacher(){
        return new PHPTeacher();
    }

    @Bean
    @Scope("prototype")
    public EnglishCourse englishCourse(){
        return new EnglishCourse(englishTeacher());
    }

    @Bean
    public JavaCourse javaCourse(){
        return new JavaCourse(javaTeacher());
    }

    @Bean
    public JavaCourse javaCourse2(){
        return new JavaCourse(javaTeacher());
    }

    @Bean
    @Primary
    public JavaTeacher javaTeacher(){
        return new JavaTeacher();
    }

    @Bean
    public PHPCourse phpCourse(){
        return new PHPCourse();
    }

    @Bean
    public HTMLCourse htmlCourse(){return new HTMLCourse();}


}
