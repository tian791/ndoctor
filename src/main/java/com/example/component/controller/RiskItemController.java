package com.example.component.controller;

import com.example.component.entity.RiskItem;
import com.example.component.repository.RiskItemRepository;
import com.example.component.service.RiskItemService;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@RestController
public class RiskItemController {

    @Autowired
    RiskItemRepository riskItemRepository;

    @Autowired
    RiskItemService riskItemService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String testForSuccess(){
        return "Test successfully!!!";
    }

    @RequestMapping(value = "/riskItem/{id}",method = RequestMethod.GET)
    public String getRiskItem(@PathVariable("id") Integer id){
        RiskItem one = riskItemRepository.getOne(id);
        System.out.println(one.toString());
        return one.toString();
    }

    @RequestMapping(value = "/getData",method = RequestMethod.POST)
    public String getData(@RequestBody String request){
        System.out.println(request);

        riskItemService.dataParseAndSave(request);

        return "";
    }



    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(Long.valueOf("1589441843916")));
    }

}
