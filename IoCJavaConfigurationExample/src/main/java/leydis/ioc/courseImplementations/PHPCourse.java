package leydis.ioc.courseImplementations;

import leydis.ioc.interfaces.Course;
import leydis.ioc.interfaces.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by ley on 31/10/2016.
 */
public class PHPCourse implements Course {
    /*Field injection*/
    /*@Autowired
    @Qualifier("phpTeacher")*/
    private Teacher teacher;

    public PHPCourse() {
        System.out.println(">> Inside the PHPCourse constructor");
    }
    /*method or setter injection*/
    @Autowired
    @Qualifier("phpTeacher")
    public void setTeacher(Teacher teacher) {
        System.out.println("Inside PHPCourse Teacher setter");
        this.teacher = teacher;
    }

    public String getCourseName() {
        return "Easy PHP";
    }

    public String getTeacherName() {
        return teacher.getTeacherName();
    }
}
