package com.interfazgrafica.version1.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/new-data") // Ruta para recibir mensajes
    @SendTo("/topic/data") // Ruta para enviar mensajes a los clientes
    public String sendData(String data) {
        return data; // Envía los datos a los clientes
    }


    @MessageMapping("/new-ticket") // Ruta para recibir mensajes
    @SendTo("/topic/ticket") // Ruta para enviar mensajes a los clientes
    public String sendTiket(String ticket) {
        return ticket; // Envía los datos a los clientes
    }
}
