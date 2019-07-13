package com.xcy.area.dao;


import com.xcy.area.pojo.Area;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-11 21:44
 **/
public interface AreaDao {

    public List<Area> selectByLevel();

    public List<Area> selectCityById(Integer id);

    public List<Area> selectCountryById(Integer id);
}
