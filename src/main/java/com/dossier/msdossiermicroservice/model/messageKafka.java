package com.dossier.msdossiermicroservice.model;

import com.dossier.msdossiermicroservice.dto.EmailMessage;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class messageKafka {

    private String email;
    private EmailMessage emailMessage;
    private Long id;
}
