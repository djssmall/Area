package com.xcy.area.service.impl;

import com.xcy.area.dao.AreaDao;
import com.xcy.area.pojo.Area;
import com.xcy.area.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-11 21:51
 **/
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao ;
    public List<Area> selectProvince() {
        List<Area> list = areaDao.selectByLevel();
        return list;
    }

    @Override
    public List<Area> selectCity(Integer id) {
        List<Area> list = areaDao.selectCityById(id);
        return list;
    }

    @Override
    public List<Area> selectCountry(Integer id) {
        List<Area> list = areaDao.selectCountryById(id);
        return list;
    }
}
