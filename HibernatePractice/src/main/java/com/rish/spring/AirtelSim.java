package com.rish.spring;

import com.rish.spring.service.Service;

public class AirtelSim {
    private Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void enableService() {
        service.enableService();
    }
}
