package leydis.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ley on 27/10/2016.
 */
@Component("myEnglishCourse") //myEnglishCourse is the name of the EnglishCourse bean in the context. Use the default scope (singleton)
public class EnglishCourse implements Course {

    /*
    //field injection with @Autowired and @Qualifier
    @Autowired
    @Qualifier("englishTeacher")*/
    private Teacher teacher;

    //constructor injection with @Autowired and @Qualifier. For constructor injection using @Qualifier, this annotation must be inside
    // the constructor parameter, before the specific element that will be injected.
    @Autowired
    public EnglishCourse(/*@Qualifier("englishTeacher")*/ Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTeacherName() {
        return teacher.getTeacherName();
    }

    public String getCourseName() {
        return "English for all";
    }
}
