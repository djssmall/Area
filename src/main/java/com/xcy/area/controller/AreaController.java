package com.xcy.area.controller;


import com.xcy.area.pojo.Area;
import com.xcy.area.service.AreaService;
import com.xcy.area.utils.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: djs
 * @create: 2019-07-11 21:54
 **/
/*@Controller
@ResponseBody*/
@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("/province.do")
    public JsonBean findProvince(){
        List<Area> areaList = areaService.selectProvince();
        return new JsonBean(1,areaList);
    }

    @RequestMapping("/city.do")
    public JsonBean findCity(Integer id){
        List<Area> areaList = areaService.selectCity(id);
        return new JsonBean(1,areaList);
    }

    @RequestMapping("/country.do")
    public JsonBean findCountry(Integer id){
        List<Area> areaList = areaService.selectCountry(id);
        return new JsonBean(1,areaList);
    }
}
