package com.dossier.msdossiermicroservice.dto;

import com.dossier.msdossiermicroservice.dto.enumm.Theme;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Getter
@Setter
public class EmailMessage {

    private String address;
    private Theme theme;
    private Long applicationId;
}
