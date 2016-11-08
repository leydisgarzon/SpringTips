package leydis.ioc.courseImplementations;

import leydis.ioc.interfaces.Course;
import leydis.ioc.interfaces.Teacher;
import leydis.ioc.teacherImplementations.EnglishTeacher;

/**
 * Created by ley on 31/10/2016.
 */
public class EnglishCourse implements Course {
    private EnglishTeacher teacher;

    public EnglishCourse(EnglishTeacher teacher) {
        System.out.println(">> Inside the EnglishCourse constructor");
        this.teacher = teacher;
    }

    public String getCourseName() {
        return "English for all";
    }

    public String getTeacherName() {
        return teacher.getTeacherName();
    }

    public EnglishTeacher getTeacher() {
        return teacher;
    }
}
