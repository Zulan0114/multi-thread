package com.example.multithread.threadsafe;

public class UserInfoRun {
    public static void main(String[] args) {
        try {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName("123");
            userInfo.setPassword("321");
            UserInfoService userInfoService = new UserInfoService();
            UserInfoThread a = new UserInfoThread(userInfo, userInfoService);
            a.setName("A");
            a.start();
            Thread.sleep(50);
            UserInfoThread b = new UserInfoThread(userInfo, userInfoService);
            b.setName("B");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
