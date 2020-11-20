package com.mentoria.estimate.services.mail;

import org.springframework.stereotype.Component;

@Component
public interface MailFactory {

  void sendEmail(String recipient, String subject, String emailBody);

}
