package com.chat.app.controller;
// This controller will handle all the incoming messages
// that is being send from the frontend ,and broadcast it to clients

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chat.app.model.ChatMessage;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")


    public ChatMessage sendMessage(ChatMessage msg){
        return msg;
    }

    @GetMapping("chat")
    public String chat(){
        return "chat";
    }

}
