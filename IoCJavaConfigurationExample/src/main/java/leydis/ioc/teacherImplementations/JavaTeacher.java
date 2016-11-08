package leydis.ioc.teacherImplementations;

import leydis.ioc.interfaces.Teacher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySources;

/**
 * Created by ley on 31/10/2016.
 */
public class JavaTeacher implements Teacher {
    @Value("${java.name}")
    private String name;

    public JavaTeacher() {
        System.out.println(">> Inside the JavaTeacher constructor");
    }

    public String getTeacherName() {
        return name;
    }
}
