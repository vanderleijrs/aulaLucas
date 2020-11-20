package com.mentoria.estimate.services.mail;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Mailgun")
@Primary
public class MailgunFactory implements MailFactory {

  private String mailgunPassword;
  private String mailgunUsername;

  public MailgunFactory(@Value("mailgun.password") String mailgunPassword,
                        @Value("mailgun.password") String mailgunUsername) {

    System.out.println("mailgunPassword: " + mailgunPassword);
    System.out.println("mailgunUsername: " + mailgunUsername);

  }

  public void sendEmail(String recipient, String subject, String emailBody) {

//    Unirest.post().basicAuth(mailgunPassword, mailgunUsername)
  }


}
