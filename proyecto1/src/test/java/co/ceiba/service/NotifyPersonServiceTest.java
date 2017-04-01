package co.ceiba.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.ceiba.domain.Person;
import co.ceiba.testdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {
  private NotifyPersonService notifyPersonService;
  private EmailService emailService;
  
  @Before
  public void setup(){
	  emailService = new EmailService();
	  notifyPersonService = new NotifyPersonService(emailService);
  }
  
  @Test
  //Patron AAA
  public void notifyTest(){
	  //Arrange codigo necesario para que la prueba se ejecute
	  Person person = new PersonTestDataBuilder().build();
	  //Act lo que quiero que haga la prueba
	  String message = notifyPersonService.notify(person);
	  //Assert lo esperado despues de ejecutar la prueba 
	  Assert.assertNotNull(message);
  }
}
