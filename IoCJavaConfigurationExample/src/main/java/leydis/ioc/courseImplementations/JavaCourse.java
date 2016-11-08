package leydis.ioc.courseImplementations;

import leydis.ioc.interfaces.Course;
import leydis.ioc.interfaces.Teacher;

/**
 * Created by ley on 31/10/2016.
 */
public class JavaCourse implements Course {

    private Teacher teacher;

    public JavaCourse(Teacher teacher) {
        System.out.println(">> Inside the JavaCourse constructor");
        this.teacher = teacher;
    }

    public String getCourseName() {
        return "Java for beginners";
    }

    public String getTeacherName() {
        return teacher.getTeacherName();
    }
}
