package com.rish.spring.simImpl;

import com.rish.spring.sim.Sim;

public class Airtel implements Sim {
    @Override
    public void calling() {
        System.out.println("Calling using Airtel");
    }

    @Override
    public void data() {
        System.out.println("Browsing using Airtel");
    }
}
