package life.majiang.community.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.xml.internal.stream.buffer.stax.NamespaceContexHelper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "name") String name , Model model){
        model.addAttribute("name", name);

        return "hello";
    }







}
