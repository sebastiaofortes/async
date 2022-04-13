package com.micros.async.service;

import org.springframework.scheduling.annotation.Async;

public class SendEmailService {

	
	
public void Send() {
	
	
	try {
		Thread.sleep(30000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	System.out.println("Emails enviados com sucesso!");
}	

@Async	
public void ASend() {
	
	
	try {
		Thread.sleep(30000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	System.out.println("Emails enviados com sucesso!");
}	




	public SendEmailService() {
		// TODO Auto-generated constructor stub
	}

}
