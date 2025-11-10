package com.ipn.mx.administracioneventos.features.evento.service.impl;

import com.ipn.mx.administracioneventos.util.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


class EmailServiceImpl implements EmailService {
@Autowired
private JavaMailSender mailSender;

    Resource
    @Override
    public void enviarCorreo() {

        MimeMailMessage message = mailSender.createMimeMessage();
        MimeMessageHelper;

        try{
            messageHelper = new MimeMessageHelper(message,true , "UTF-8");
            messageHelper.setFrom(new InternetAddress("noreplygmail.com", "Administracion de Eventos"));
            messageHelper.addAttachment(attachmentFilename "archivo", new File())

        }

    }
}
