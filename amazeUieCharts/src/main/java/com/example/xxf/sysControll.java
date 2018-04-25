package com.example.xxf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Z_ on 2018/3/16.
 */
@Controller
@RequestMapping("/admin")
public class sysControll {

    @RequestMapping("/account_login")
    public String login(Model model){
        model.addAttribute("name","Hz");
       //    System.out.println(htmlName);
        String url = "";
        return "admin/index";
    }

    @RequestMapping("/tables")
    public String table(){
        return "admin/tables";
    }
    @RequestMapping("/home")
    public String home(){
        return "admin/home2";
    }
    @RequestMapping("/chart")
    public String chart(){
        return "admin/chart";
    }
    @RequestMapping("/monthly_finance_plan")
    @ResponseBody
    public int[] monthly_finance_plan(){
        System.out.println("----->>>/monthly_finance_plan");
        return new int[]{120, 132, 101, 134, 90};
    }
    @RequestMapping("/fightScreen")
    public String fightScreen(){
        return "admin/fightScreen";
    }
    @RequestMapping("/fightScreen2")
    public String fightScreen2(){
        return "admin/fightScreen2";
    }
}
