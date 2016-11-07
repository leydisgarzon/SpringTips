package leydis.spring.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by ley on 27/10/2016.
 */
@Component
@Primary //@Primary indicates that this implementation is favorite for inject, among the other implementation, if @Qualifier is not declared. It is like a default implementation to inject.
public class JavaTeacher implements Teacher {
    @Value("${java.name}")
    String name;
    public String getTeacherName() {
        return name;
        /*return "Chad Darby";*/
    }
}
