package com.example.xxf.comms;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


@Configuration
public class DataSourceConfig {

    @Value("${spring.datasource.xxfcar.jdbc-url}")
    private String defaultDBUrl;
    @Value("${spring.datasource.xxfcar.username}")
    private String defaultDBUser;
    @Value("${spring.datasource.xxfcar.password}")
    private String defaultDBPassword;
    @Value("${spring.datasource.xxfcar.driver-class-name}")
    private String defaultDBDreiverName;

    @Value("${spring.datasource.xxf.jdbc-url}")
    private String masterDBUrl;
    @Value("${spring.datasource.xxf.username}")
    private String masterDBUser;
    @Value("${spring.datasource.xxf.password}")
    private String masterDBPassword;
    @Value("${spring.datasource.xxf.driver-class-name}")
    private String masterDBDreiverName;


    @Value("${spring.datasource.localxxf.jdbc-url}")
    private String localxxfDBUrl;
    @Value("${spring.datasource.localxxf.username}")
    private String localxxfDBUser;
    @Value("${spring.datasource.localxxf.password}")
    private String localxxfDBPassword;
    @Value("${spring.datasource.localxxf.driver-class-name}")
    private String localxxfDBDreiverName;

    @Bean
    public DynamicDataSource dynamicDataSource() {

        DynamicDataSource dynamicDataSource = DynamicDataSource.getInstance();

        DruidDataSource xxfcarDataSource = new DruidDataSource();
        xxfcarDataSource.setUrl(defaultDBUrl);
        xxfcarDataSource.setUsername(defaultDBUser);
        xxfcarDataSource.setPassword(defaultDBPassword);
        xxfcarDataSource.setDriverClassName(defaultDBDreiverName);

        DruidDataSource xxfDataSource = new DruidDataSource();
        xxfDataSource.setDriverClassName(masterDBDreiverName);
        xxfDataSource.setUrl(masterDBUrl);
        xxfDataSource.setUsername(masterDBUser);
        xxfDataSource.setPassword(masterDBPassword);


        DruidDataSource localXXFSource = new DruidDataSource();
        localXXFSource.setDriverClassName(localxxfDBDreiverName);
        localXXFSource.setUrl(localxxfDBUrl);
        localXXFSource.setUsername(localxxfDBUser);
        localXXFSource.setPassword(localxxfDBPassword);


        Map<Object,Object> map = new HashMap<>();
        map.put("xxfcar", xxfcarDataSource);
        map.put("xxf", xxfDataSource);
        map.put("local", localXXFSource);
        dynamicDataSource.setTargetDataSources(map);
        dynamicDataSource.setDefaultTargetDataSource(xxfcarDataSource);

        return dynamicDataSource;
    }


    @Bean
    public SqlSessionFactory sqlSessionFactory(
            @Qualifier("dynamicDataSource") DataSource dynamicDataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dynamicDataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:mybatis/mapper/*.xml"));
        bean.setConfigLocation(new ClassPathResource("mybatis/mybatis-config.xml"));
        return bean.getObject();

    }

    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(
            @Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory)
            throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}