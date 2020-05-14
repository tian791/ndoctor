package com.example.component.controller;

import com.example.component.entity.RiskItem;
import com.example.component.repository.RiskItemRepository;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RiskItemController {

    @Autowired
    RiskItemRepository riskItemRepository;

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

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(request, JsonObject.class);
        JsonArray data = jsonObject.get("data").getAsJsonArray();

        for (JsonElement jsonElement : data) {
            JsonObject object = jsonElement.getAsJsonObject();
            System.out.println("object = ");
            System.out.println(object);
            JsonElement positiveId = object.get("positive_id");
            JsonElement relativeId = object.get("relative_id");

            System.out.println(positiveId);
            System.out.println(relativeId);

            JsonArray relativeIdAsJsonArray = relativeId.getAsJsonArray();
            for (JsonElement jsonElement1 : relativeIdAsJsonArray) {
                System.out.println(jsonElement1);
                JsonElement userId = jsonElement1.getAsJsonObject().get("user_id");
                JsonElement score = jsonElement1.getAsJsonObject().get("score");
                System.out.println(userId);
                System.out.println(score);

                RiskItem item = new RiskItem();
                item.setPositiveId(positiveId.getAsString());
                item.setScore(score.getAsString());
                item.setUserId(userId.getAsString());
                item.setCreateTime(String.valueOf(System.currentTimeMillis()));
                item.setUpdateTime(String.valueOf(System.currentTimeMillis()));
                item.setResultTime(String.valueOf(System.currentTimeMillis()));
                insertItem(item);

            }
            System.out.println("=========================");
        }
        return "";
    }

    public RiskItem insertItem(RiskItem riskItem){
        RiskItem item = riskItemRepository.saveAndFlush(riskItem);
        return item;
    }

}
