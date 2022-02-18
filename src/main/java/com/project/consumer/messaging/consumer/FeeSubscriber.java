package com.project.consumer.messaging.consumer;


import com.project.consumer.config.RabbitMQConfig;
import com.project.consumer.model.Fee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeeSubscriber {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Fee fee) {
        System.out.println("Fee message received & consumed from queue : " + fee);
        List<Integer> fees = new ArrayList<>();
        fees.add(fee.getTotalFee());
        int sum=0;
        for(int i=0;i<fees.size();i++){
            sum =+ fees.get(i);
        }int average = sum /fees.size();
        System.out.println("Average total fee is "+ average);
    }

}
