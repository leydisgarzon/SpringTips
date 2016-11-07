package leydis.spring.ioc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ley on 27/10/2016.
 */
@Component
public class EnglishTeacher implements Teacher {

    public String getTeacherName() {
        return "Anna Smith";
    }

    @PostConstruct
    public void startUpMethod(){
        System.out.println(">> Inside EnglishTeacher init method");
    }

    @PreDestroy
    public void cleanUpMethod(){System.out.println(">> Inside EnglishTeacher destroy method");}
}
