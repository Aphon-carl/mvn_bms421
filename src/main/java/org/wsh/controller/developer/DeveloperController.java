package org.wsh.controller.developer;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wsh.pojo.AppCategory;
import org.wsh.pojo.DataDictionary;
import org.wsh.pojo.DevUser;
import org.wsh.service.developer.DevUserDaoService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/dev")
public class DeveloperController {

    @Resource
    private DevUserDaoService devuserDaoService;

//    从index页面跳转到用户登录界面
    @RequestMapping("/showlogin")
    public String showlogin(){
       return "devlogin";
    }

    @RequestMapping("/Login")
    public String Login(ModelMap map, String devCode, String devPassword){

        DevUser devuser = devuserDaoService.findByDevName(devCode);

        if (!devuser.getDevPassword().equals(devPassword)){
            return "devlogin";
        }else{
            map.addAttribute("devUserSession",devuser);
            return "/dev/main";

        }

    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("devUserSession");
        session.invalidate();
        return "/devlogin";
    }

    @RequestMapping("/list")
    public String list(ModelMap map) {
        List<DataDictionary> statusList = devuserDaoService.statusList();

        List<DataDictionary> flatFormList = devuserDaoService.flatFormList();

        List<AppCategory> categoryLevel1List = devuserDaoService.categoryLevel1List();

        List<AppCategory> categoryLevel2List = devuserDaoService.categoryLevel2List();

        List<AppCategory> categoryLevel3List = devuserDaoService.categoryLevel3List();

        //保存数据
        map.addAttribute("statusList", statusList);
        map.addAttribute("flatFormList", flatFormList);
        map.addAttribute("categoryLevel1List", categoryLevel1List);
        map.addAttribute("categoryLevel2List", categoryLevel2List);
        map.addAttribute("categoryLevel3List", categoryLevel3List);


        return "/dev/appinfolist"; //直接跳转
    }

}
