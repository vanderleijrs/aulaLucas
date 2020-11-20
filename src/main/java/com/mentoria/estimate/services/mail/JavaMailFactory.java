package com.mentoria.estimate.services.mail;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("JavaMail")
public class JavaMailFactory implements MailFactory {

  private String mailgunPassword;
  private String mailgunUsername;

  public JavaMailFactory(@Value("mailgun.password") String mailgunPassword,
                         @Value("mailgun.password") String mailgunUsername) {

    System.out.println("mailgunPassword: " + mailgunPassword);
    System.out.println("mailgunUsername: " + mailgunUsername);

  }

  public void sendEmail(String recipient, String subject, String emailBody) {

//    Unirest.post().basicAuth(mailgunPassword, mailgunUsername)
  }


}
