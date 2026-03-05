package org.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class ServiceA {
    private ServiceB serviceB;
//    @Lazy
//    public ServiceA(ServiceB serviceB){
//        this.serviceB = serviceB;
//    }
    @Autowired
    public void setServiceB(ServiceB serviceB){
        this.serviceB = serviceB;
    }
}

