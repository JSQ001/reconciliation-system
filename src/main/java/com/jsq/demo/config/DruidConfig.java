package com.jsq.demo.config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DruidConfig {
  @Primary
  @Bean
  public DataSource druidDataSource(){

    Logger logger = LogManager.getLogger(this.getClass());
    logger.debug("正在创建druid连接池...");
    return DruidDataSourceBuilder.create().build();
  }

}
