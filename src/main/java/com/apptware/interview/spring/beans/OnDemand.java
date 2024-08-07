package com.apptware.interview.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component()
public class OnDemand {

  @Getter private final String someString;
  


  @Autowired
  OnDemand(String someString) {
    this.someString = someString;
  }
  
 
  
  
  
}
