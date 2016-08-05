package com.dzz.websocket;

import com.dzz.websocket.domain.DzzMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by dzz on 16/8/5.
 */
@Controller
public class DzzController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public DzzResponse say(DzzMessage dzzMessage) throws Exception{

        return new DzzResponse("welcome, "+dzzMessage.getName()+" !");
    }
}
