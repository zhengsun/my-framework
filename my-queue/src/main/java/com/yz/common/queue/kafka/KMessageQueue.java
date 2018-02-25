package com.yz.common.queue.kafka;

import com.yz.common.queue.IMessageQueue;
import com.yz.common.queue.QueueHandler;
import org.springframework.stereotype.Component;

@Component
public class KMessageQueue implements IMessageQueue {
    @Override
    public boolean publish(String channel, Object o) {
        return false;
    }

    @Override
    public void subscribe(String channel, QueueHandler queueHandler) throws Exception {

    }

    @Override
    public void put(String channel, Object o) throws InterruptedException {

    }
}
