package com.rish.spring;

import com.rish.spring.database.JdbcConfig;
import com.rish.spring.sim.Sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Mobile {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        /*Sim simBean = context.getBean("sim", Sim.class);
        simBean.calling();
        simBean.data();
        AirtelSim airtelSim =context.getBean("airtelSim", AirtelSim.class);
        airtelSim.enableService();*/
        JdbcConfig jdbcConfig = context.getBean("jdbcConfig", JdbcConfig.class);
        jdbcConfig.display();
        jdbcConfig.jbdcConfiguration();
    }
}
