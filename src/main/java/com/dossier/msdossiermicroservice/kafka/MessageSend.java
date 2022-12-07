package com.dossier.msdossiermicroservice.kafka;

import com.dossier.msdossiermicroservice.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


@Slf4j
public class MessageSend {

    protected JavaMailSender email;

    public void sendMessage(Message massage)
    {
        SimpleMailMessage simpleMessage= new SimpleMailMessage();
        simpleMessage.setTo(massage.getAddress());
        simpleMessage.setSubject(massage.getTopic());
        simpleMessage.setText(massage.getMessage());

        log.info("{}", simpleMessage);

        try
        {
        email.send(simpleMessage);
        }
        catch (Exception er){
            log.error(er.toString());
        }
    }
}
