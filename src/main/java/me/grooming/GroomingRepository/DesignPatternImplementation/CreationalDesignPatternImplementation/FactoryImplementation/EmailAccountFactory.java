package me.grooming.GroomingRepository.DesignPatternImplementation.CreationalDesignPatternImplementation.FactoryImplementation;

public class EmailAccountFactory {
	
	public EmailServiceProvider createEmailAccount(String emailServiceProviderName) {
		
		if(emailServiceProviderName.equalsIgnoreCase("Yandex Mail")) {
			
			return new YandexMail();
			
		}
		
		if(emailServiceProviderName.equalsIgnoreCase("Proton Mail")) {
			
			return new ProtonMail();
			
		}
		
		return null;
		
	}

}