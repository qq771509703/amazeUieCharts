package com.example.xxf;

import com.example.xxf.Util.MD5Tools;
import com.example.xxf.bean.TBaseDataAnalyzeMenu;
import com.example.xxf.bean.Tuser;
import com.example.xxf.service.LoginService;
import com.example.xxf.vo.ResponseVo;
import com.example.xxf.vo.Tree;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Z_ on 2018/3/16.
 */
@Controller
@RequestMapping("/admin")
public class sysControll {

    @Resource
    LoginService loginService;

    @RequestMapping("/account_login")
    @ResponseBody
    public ResponseVo login(Model model, String account, String pwd, HttpServletRequest request){

        ResponseVo vo = new ResponseVo();

        Tuser user = loginService.getUserByAccount(account);
        if (user != null) {
            //将登录时输入的密码加密进后行对比
            String md5Pwd = MD5Tools.MD5(pwd);
            if (user.getPassword().equalsIgnoreCase(md5Pwd)){
                HttpSession session = request.getSession();
                session.setAttribute("name",user.getName());
                //model.addAttribute("name",user.getName());
                List<Tree<TBaseDataAnalyzeMenu>> menus = loginService.getAccountMenu(user);
                session.setAttribute("menus",menus);
            }else{
                vo.setCode(ResponseVo.UNAUTH);
                vo.setMsg("密码错误");
            }
        }else {
            vo.setCode(ResponseVo.UNAUTH);
            vo.setMsg("登录账号不存在");
        }
        return vo;
    }

    @RequestMapping("/index")
    public String toIndexPage(){
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

    @RequestMapping("/perCapitaCapacity")
    public String perCapitaCapacity(){
        return "admin/perCapitaCapacity";
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
    @RequestMapping("/fightScreen3")
    public String fightScreen2(){
        return "admin/fightScreen3";
    }

    @RequestMapping("/performanceRecord")
    public String performanceRecord(){
        return "admin/performanceRecord";
    }
    @RequestMapping("/roleList")
    public String roleList(){
        return "admin/role/roleEdit";
    }
}
