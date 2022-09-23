package com.pt.vx.config;
import java.time.LocalDate;

import com.pt.vx.domain.BirthDay;
import com.pt.vx.domain.User;

import java.util.ArrayList;
import java.util.List;

    private static void init(){
        //如果要多个人的话，就复制这个一遍，然后填写里面的内容。这里默认两个人,大伙应该是两个人吧（笑）
        userList.add(getUser(
                "ov9Nj6nsEo1oo5L-ZkUo5P_um-hA",//扫码关注你的测试号以后，测试平台会出现TA的微信号
                "七七",//咋称呼这个人
                "广东省深圳市龙岗区",//这个人的详细地址
                "深圳",//这个人在的城市
                "X2kBELSk_H-6U0EmmVDxwV9z-GWfjgv3ZAY_tu-aJ7M"));//要给这个人发送的模板ID

        userList.add(getUser(
                "ov9Nj6jShJZZZLs9VNIUII8ZQ24I",
                "纸包鱼OvO",
                "广东省深圳市盐田区",//这个人的详细地址
                "深圳",//这个人在的城市
                "X2kBELSk_H-6U0EmmVDxwV9z-GWfjgv3ZAY_tu-aJ7M"));//要给这个人发送的模板ID

        
    }

    public static final List<User> userList = new ArrayList<>();
    static {
        init();
    }


    private static User getUser(String Vx, String username,
                                BirthDay birthday,
                                BirthDay careDay,
                                LocalDate loveDay,
                                String address, String city, String templateId){
        User user=new User();
        user.setVx(Vx);
        user.setUserName(username);
        user.setCareDay(careDay);
        user.setBirthDay(birthday);
        user.setLoveDay(loveDay);
        user.setAddress(address);
        user.setCity(city);
        user.setTemplateId(templateId);
        return user;
    }



}
