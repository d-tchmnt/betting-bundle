package com.nb.bettingapp.app;

import com.nb.bettingapp.BettingAppConfiguration;
import com.nb.bettingcore.BettingCoreConfiguration;
import com.nb.gateway.BettingAdapterConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {BettingAppConfiguration.class, BettingAdapterConfiguration.class, BettingCoreConfiguration.class})
public class BettingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BettingApplication.class, args);
    }

}
