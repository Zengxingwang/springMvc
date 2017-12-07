package web;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by 曾兴旺
 * 2017/12/6
 * description:
 */
@Controller
@RequestMapping("/web")
public class SpringMvcAction {

    @RequestMapping("/hello.do")
    @ResponseBody
    public String hello( ){
        return "hello world,sun";
    }

    @RequestMapping("/login.do")
    public String login(@RequestParam("name") String name, @RequestParam("pwd")String pwd , ModelMap map){
        if("admin".equals(name) && "123".equals(pwd)){
            map.addAttribute("name",name);
            return "hello";
        }else {
            return "error";
        }
    }
}
