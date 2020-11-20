package com.mentoria.estimate.services;

import com.mentoria.estimate.services.mail.MailFactory;
import com.mentoria.estimate.services.entities.Estimate;
import com.mentoria.estimate.services.repositories.EstimateRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EstimateService {

  private EstimateRepository repository;
  private MailFactory mailGun;
  private MailFactory javaMail;

  public void EstimateService(EstimateRepository repository, @Qualifier("JavaMail") MailFactory javaMail,
                              @Qualifier("Mail") MailFactory mailGun) {
    this.mailGun = mailGun;
    this.javaMail = javaMail;
    this.repository = repository;
  }

  public Estimate createEstimate(Estimate estimate) {
    Estimate savedEstimate = repository.save(estimate);
    sendEstimateEmailTo5Marias(savedEstimate);
    sendEstimateEmailToRequester(savedEstimate);
    sendEstimateEmailToTransporter(savedEstimate);
    return  savedEstimate;
  }

  private void sendEstimateEmailTo5Marias(Estimate savedEstimate) {

    String address = "lucasbz@gmail.com";
    sendEmail(address, "NOVO ORçAMENTO", EstimateEmail.estimateEmailBody(savedEstimate));
  }


  private void sendEstimateEmailToRequester(Estimate savedEstimate) {

    String address = "lucasbz@gmail.com";
    String body = "Conteúdo do Email";
    sendEmail(address, "", body);
  }

  private void sendEstimateEmailToTransporter(Estimate savedEstimate) {

    String address = "lucasbz@gmail.com";
    String body = "Conteúdo do Email";
    sendEmail(address, "", body);
  }

  private void sendEmail(String address, String subject, String body) {
    try {
      mailGun.sendEmail(address, subject, body);
    } catch (Exception e) {
      javaMail.sendEmail(address, subject, body);
    }
  }

}
