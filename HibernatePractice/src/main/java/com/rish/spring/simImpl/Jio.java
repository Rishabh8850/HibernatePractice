package com.rish.spring.simImpl;

import com.rish.spring.sim.Sim;

public class Jio implements Sim {
    @Override
    public void calling() {
        System.out.println("Calling using Jio");
    }

    @Override
    public void data() {
        System.out.println("Browsing using Jio");
    }
}
