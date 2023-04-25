package me.grooming.GroomingRepository.DesignPatternImplementation.CreationalDesignPatternImplementation.FactoryImplementation;

public interface EmailServiceProvider {
	
	public String getDomainName();
	
	public void signUp();
	
	public void signIn();
	
	public void signOut();

}