package com.businessRules;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;


public class Demo {

	public static String businessProcess(String paymentFor) {
	  	
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("first-ksession-rule");
		
		PaymentOffer paymentOffer = new PaymentOffer();
		paymentOffer.setPaymentFor(paymentFor);
				
		FactHandle factHandler;
		
		factHandler = kSession.insert(paymentOffer);
		kSession.fireAllRules();
		
		return paymentOffer.getOffer();    
	}
}
