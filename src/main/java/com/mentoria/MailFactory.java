package com.mentoria;

import org.springframework.stereotype.Component;

@Component
public interface MailFactory {

  void sendEmail(String recipient, String subject, String emailBody);

}
