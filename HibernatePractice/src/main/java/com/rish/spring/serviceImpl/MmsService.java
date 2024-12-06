package com.rish.spring.serviceImpl;

import com.rish.spring.service.Service;

public class MmsService implements Service {
    @Override
    public void enableService() {
        System.out.println("Multimedia Messages Enablement");
    }
}
