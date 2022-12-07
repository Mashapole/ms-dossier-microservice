package com.dossier.msdossiermicroservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String address;
    private String topic;
    private String message;
}
