package net.codejava;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class MvcController {
     
    @RequestMapping("/feed")
    public String home() {
        System.out.println("Going home...");
        return "feed";
    }
    @RequestMapping("/Register")
    public String showForm(Model model) {
        Student student = new Student();
        List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
         
        model.addAttribute("student", student);
        model.addAttribute("professionList", professionList);
         
        return "R_Form";
     
    }
    @PostMapping("/Register")
    public String submitForm(@ModelAttribute("student") Student student) {
         
        System.out.println(student);
         
        return "R_Success";
    }
}