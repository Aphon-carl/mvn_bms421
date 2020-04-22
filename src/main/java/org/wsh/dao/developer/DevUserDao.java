package org.wsh.dao.developer;

import org.wsh.pojo.AppCategory;
import org.wsh.pojo.DataDictionary;
import org.wsh.pojo.DevUser;

import java.util.List;

public interface DevUserDao {

    //    登录
    public DevUser findByDevName(String devCode);

    public List<DataDictionary> statusList(); //APP状态

    public List<DataDictionary> flatFormList(); //所属平台

    public List<AppCategory> categoryLevel1List(); //一级分类

    public List<AppCategory> categoryLevel2List(); //二级分类

    public List<AppCategory> categoryLevel3List(); //三级分类


}
