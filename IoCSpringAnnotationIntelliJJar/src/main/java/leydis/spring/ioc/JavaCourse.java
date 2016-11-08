package leydis.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ley on 27/10/2016.
 */
@Component //the name of the bean will be the same of the class with the first letter lowercase
//@Scope("prototype")
public class JavaCourse implements Course {
    //@Autowired //field injection, not need setter method
    //@Qualifier("javaTeacher") //to specify the id of which interface's implementation inject when we have more than one implementation
    private Teacher teacher;

    /*
    // constructor injection  with autowired
    @Autowired //from Spring 4.3 @Autowired is not necessary if only one constructor is defined, therefore in this case isn't necessary
    public JavaCourse(Teacher teacher) {
        this.teacher = teacher;
    }*/


    // setter and method injection with autowired.@Autowired could be used in any method, not only setter, it use that method for dependency injection.
    @Autowired(required = false) //avoid exception when there are not implementation of the bean for inject
    @Qualifier("javaTeacher")   //then if spring don't find a javaTeacher bean, the field teacher will be null
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTeacherName() {
        if(teacher == null)
            return "teacher no asignated";
        else
            return teacher.getTeacherName();
    }

    public String getCourseName() {
        return "Java for beginner";
    }

    //define init method
    @PostConstruct
    public void duringConstruct(){
        System.out.println(">> Inside JavaCourse post construct method");
    }

    //define destroy method
    @PreDestroy // this method don't work for prototype scope
    public void duringDestroy(){
        System.out.println(">> Inside JavaCourse pre destroy method");
    }

}
