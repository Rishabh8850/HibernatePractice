package com.rish.spring.serviceImpl;

import com.rish.spring.service.Service;

public class DataService implements Service {
    @Override
    public void enableService() {
        System.out.println("Enabling internate browsing service");
    }
}
