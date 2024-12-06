package com.rish.spring.serviceImpl;

import com.rish.spring.service.Service;

public class MissedCallAlertService implements Service {
    @Override
    public void enableService() {
        System.out.println("Enabling Missed call Alert Service");
    }
}
