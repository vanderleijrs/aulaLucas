package com.mentoria.services;

import com.mentoria.services.entities.Estimate;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class EstimateEmailTest {

  @Test
  public void shouldIncludeRequesterName(){

    Estimate estimateEntity = Estimate.builder()
        .name("Fulano")
        .address("Porto Alegre")
        .build();
    String emailBody = EstimateEmail.estimateEmailBody(estimateEntity);

    assertThat(emailBody, CoreMatchers.containsString("Fulano"));
  }

}