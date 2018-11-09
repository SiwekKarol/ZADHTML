package com.example.demo.Controller;

import com.example.demo.Serwis.RandomSerwis;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
//@RequestMapping ("/aplikacja")
public class HelloController {
    private RandomSerwis randomSerwis;

    public HelloController(RandomSerwis randomSerwis) {
        this.randomSerwis = randomSerwis;
    }

    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping ("/hello")
@ResponseBody
    public String hello(){
    System.out.println("Metoda hello się wykonała");
    return "Metoda się wykonała " + randomSerwis.getSmallInt();
    }
    @GetMapping("/example")
    @ResponseBody
    public String example(){
        System.out.println("Metoda example");
        return "Metoda example";
    }
    @GetMapping ("/form")
    public String showForm(){
        return "formularz.html";
    }


//    @GetMapping ("/info")
//    @RequestMapping
//    public void parameters(HttpServletRequest request) {
//        String name = request.getParameter("imie");
//        String wiekString = request.getParameter("wiek");
//        int wiek = Integer.parseInt(wiekString);
//        System.out.println("Coś tam coś tam");
//    }
}
