package com.xcy.area.service;

import com.xcy.area.pojo.Area;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-11 21:49
 **/
public interface AreaService {

    public List<Area> selectProvince();

    public List<Area> selectCity(Integer id);

    public List<Area> selectCountry(Integer id);
}
