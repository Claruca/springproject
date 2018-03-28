package com.abc.foo;

import org.springframework.stereotype.Service;

/**
 * Created by clara.marti on 28/03/2018.
 */

//@Service("userNotificationService")
@Service
public class NotificationService {

    public NotificationService() {
    }

    public void send(){
        //algo
    }

    public void sendAsync(){
        //algo
    }

    @Override
    public String toString() {
        return "NotificationService{}";
    }
}
