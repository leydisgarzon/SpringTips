package leydis.ioc.teacherImplementations;

import leydis.ioc.interfaces.Teacher;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ley on 31/10/2016.
 */
public class PHPTeacher implements Teacher {

    public PHPTeacher() {
        System.out.println(">> Inside the PHPTeacher constructor");
    }

    public String getTeacherName() {
        return "Edward Norton";
    }

    @PostConstruct
    public void doSomethingAfter(){
        System.out.println("<< Inside PostConstructor doSomethingAfter");
    }

    @PreDestroy
    public void doSomethingBefore(){
        System.out.println("<< Inside PreDestroy doSomethingBefore");
    }
}
