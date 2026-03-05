package org.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class ServiceB {
    private ServiceA serviceA;
    @Autowired
    public void setServiceA(ServiceA serviceA){
        this.serviceA = serviceA;
    }
}
