package leydis.ioc.courseImplementations;

import leydis.ioc.interfaces.Course;
import leydis.ioc.interfaces.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ley on 01/11/2016.
 */
public class HTMLCourse implements Course {
    private Teacher teacher;

    public String getCourseName() {
        return "Basic HTML and CSS";
    }

    @Autowired //@Qualifier is no declared, then Spring inject the Teachers implementation whose bean have a @Primary annotation, in this case JavaTeacher
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTeacherName() {
        return teacher.getTeacherName();
    }
}
