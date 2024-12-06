package com.rish.spring.simImpl;

import com.rish.spring.sim.Sim;

public class Vodaphone implements Sim {

    @Override
    public void calling() {
        System.out.println("Calling using Vodaphone");
    }

    @Override
    public void data() {
        System.out.println("Browsing using Vodaphone");
    }
}
