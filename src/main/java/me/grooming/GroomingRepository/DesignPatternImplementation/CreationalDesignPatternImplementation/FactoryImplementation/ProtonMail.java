package me.grooming.GroomingRepository.DesignPatternImplementation.CreationalDesignPatternImplementation.FactoryImplementation;

public class ProtonMail implements EmailServiceProvider {
	
	@Override
	public void signUp() {

		System.out.println("Loading Proton Sign Up Page . . . . ");
		
	}

	@Override
	public void signIn() {
		
		System.out.println("Loading Proton Sign In Page . . . . ");

	}

	@Override
	public void signOut() {
		
		System.out.println("Signing Out to Proton Home Page . . . . ");

	}
	
	@Override
	public String getDomainName() {
		
		String domainName = "@proton.mail";
		return domainName;
		
	}

}