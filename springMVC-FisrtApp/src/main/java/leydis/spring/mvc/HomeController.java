package leydis.spring.mvc;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by ley on 08/11/2016.
 */

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String showHome(){
        return "home";
    }

    //example of used the request data in the returned view using ${param.get("userName")} or ${param.userName}. See processHomeForm.jsp.
    @RequestMapping(value = "/processHome")
    public String processHome(){
        return "processHomeForm";
    }

    @RequestMapping("/data")
    public String showData(){
        return "data";
    }

    //example of HttpServletRequest getParameter method for get data from the request using the name attribute in the form element.
    // Also use the Model for send data to the view.
    @RequestMapping("/processData")
    public String processData(HttpServletRequest request, Model model){
       String upperName = request.getParameter("userName").toUpperCase();
       model.addAttribute("userNameUpper",upperName);
       return "processData";
    }

    @RequestMapping("/bindingParam")
    public String showBindingParam(){
        return "bindingRequestParameter";
    }

    //example of @RequestParam to bind the request "userName" parameter to the variable name.
    // This annotation avoid the follow sentence: String name = request.getParameter("userName").toUpperCase();
    @RequestMapping("/processBindingParam")
    public String processBindingParam(@RequestParam("userName") String name, Model model){
        name = name.toUpperCase();
        model.addAttribute("userNameUpper",name);
        return "processBindingRequestParameter";
    }

}
