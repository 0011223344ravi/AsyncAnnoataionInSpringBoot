package com.example.asyncdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@Service
@Slf4j
public class ServiceDemo {


    /* All Required process */
    /*
      1. Inventory service check order availability
      2. Process payment for order
      3. Notify to the user
      3. Assign to vendor
      4. packaging
      5. assign delivery partner
      6. assign trailer
      7. dispatch product
      **/

    public Map<String , Object> processOrder(Map<String , Object> order) throws InterruptedException {
       // order.setTrackingId(UUID.randomUUID().toString());
        if (!order.isEmpty()) {
            //handle exception here
            log.info("process order request with order details as  " +order + Thread.currentThread().getName());

        } else {
            throw new RuntimeException("Technical issue please retry");
        }
        return order;
    }

   // @Async("asyncTaskExecutor")
    public void notifyUser(Map<String , Object> order) throws InterruptedException {
        Thread.sleep(4000L);
        log.info("Notified to the user " + Thread.currentThread().getName());
    }
    //@Async("asyncTaskExecutor")
    public void assignVendor(Map<String , Object> order) throws InterruptedException {
        Thread.sleep(5000L);
        log.info("Assign order to vendor " + Thread.currentThread().getName());
    }
   // @Async("asyncTaskExecutor")
    public void packaging(Map<String , Object> order) throws InterruptedException {
        Thread.sleep(2000L);
        log.info("Order packaging completed " + Thread.currentThread().getName());
    }
   // @Async("asyncTaskExecutor")
    public void assignDeliveryPartner(Map<String , Object> order) throws InterruptedException {
        Thread.sleep(10000L);
        log.info("Delivery partner assigned " + Thread.currentThread().getName());
    }

   // @Async("asyncTaskExecutor")
    public void assignTrailerAndDispatch(Map<String , Object> order) throws InterruptedException {
        Thread.sleep(3000L);
        log.info("Trailer assigned and Order dispatched " + Thread.currentThread().getName());
    }
}
