package org.wsh.service.developer.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wsh.dao.developer.DevUserDao;
import org.wsh.pojo.AppCategory;
import org.wsh.pojo.DataDictionary;
import org.wsh.pojo.DevUser;
import org.wsh.service.developer.DevUserDaoService;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DevUserDaoServiceImpl implements DevUserDaoService {

    @Resource
    private DevUserDao devuserDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public DevUser findByDevName(String devCode) {
        return devuserDao.findByDevName(devCode);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)

    public List<DataDictionary> statusList() {
        return devuserDao.statusList();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<DataDictionary> flatFormList() {
        return devuserDao.flatFormList();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<AppCategory> categoryLevel1List() {
        return devuserDao.categoryLevel1List();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<AppCategory> categoryLevel2List() {
        return devuserDao.categoryLevel2List();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<AppCategory> categoryLevel3List() {
        return devuserDao.categoryLevel3List();
    }
}
