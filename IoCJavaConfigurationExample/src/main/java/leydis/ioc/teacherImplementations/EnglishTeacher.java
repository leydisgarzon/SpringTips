package leydis.ioc.teacherImplementations;

import leydis.ioc.interfaces.Teacher;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by ley on 31/10/2016.
 */
public class EnglishTeacher implements Teacher {
    @Value("${english.age}")
    private Integer age;

    public EnglishTeacher() {
        System.out.println(">> Inside the EnglishTeacher constructor");
    }

    public String getTeacherName() {
        return "Anna Smith";
    }

    public Integer getAge() {
        return age;
    }
}
