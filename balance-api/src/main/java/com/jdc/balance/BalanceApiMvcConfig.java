package com.jdc.balance;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableAsync
@EnableScheduling
@Configuration
public class BalanceApiMvcConfig implements WebMvcConfigurer {


}
