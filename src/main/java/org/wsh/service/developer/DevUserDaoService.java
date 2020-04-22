package org.wsh.service.developer;

import org.wsh.pojo.AppCategory;
import org.wsh.pojo.DataDictionary;
import org.wsh.pojo.DevUser;

import java.util.List;

public interface DevUserDaoService {


    //    登录
    public DevUser findByDevName(String devCode);


    public List<DataDictionary> statusList();

    public List<DataDictionary> flatFormList();

    public List<AppCategory> categoryLevel1List();

    public List<AppCategory> categoryLevel2List(); //二级分类

    public List<AppCategory> categoryLevel3List(); //三级分类

}
