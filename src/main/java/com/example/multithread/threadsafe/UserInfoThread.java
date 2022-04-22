package com.example.multithread.threadsafe;

public class UserInfoThread extends Thread {
    private UserInfo userInfo;
    private UserInfoService userInfoService;

    public UserInfoThread(UserInfo userInfo, UserInfoService userInfoService) {
        super();
        this.userInfo = userInfo;
        this.userInfoService = userInfoService;
    }

    @Override
    public void run() {
        super.run();
        userInfoService.serviceFunctionA(userInfo);
    }
}
