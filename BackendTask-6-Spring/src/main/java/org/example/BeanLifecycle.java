package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifecycle implements InitializingBean, DisposableBean {
    private static Logger log = LoggerFactory.getLogger(BeanLifecycle.class);
    public BeanLifecycle(){
        log.info("1.Bean Cycle");
    }
    @Override
    public void afterPropertiesSet() throws Exception{
        log.info("2. Initialization  @PostConstruct called");
    }
    @PostConstruct
    public void postConnstructInit(){
        log.info("2. Initialization  @PostConstruct called");
    }
    @PreDestroy
    public void Predestroy(){
        log.info("4. Destruction  @PreDestroy called");
    }
    @Override
    public void destroy() throws Exception{
        log.info("5. Destruction - DisposableBean.destroy() called");
    }
}
