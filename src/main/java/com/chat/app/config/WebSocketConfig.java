package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    //msg broking is a way of routing msg
    //msg broker is a middle-man who directs the msg to the right way
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry){
        registry.addEndpoint("/chat")
                .setAllowedOriginPatterns("*")
                .withSockJS(); //this adds compatibility to the clients that don't support web sockets
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry){
        //set broker->
        registry.enableSimpleBroker("/topic");
        //tell server to process msg with prefix '/app'
        registry.setApplicationDestinationPrefixes("/app");
    }
}
