package me.grooming.GroomingRepository.DesignPatternImplementation.CreationalDesignPatternImplementation.FactoryImplementation;

public class YandexMail implements EmailServiceProvider {

	@Override
	public void signUp() {

		System.out.println("Loading Yandex Sign Up Page . . . . ");
		
	}

	@Override
	public void signIn() {
		
		System.out.println("Loading Yandex Sign In Page . . . . ");

	}

	@Override
	public void signOut() {
		
		System.out.println("Signing Out to Yandex Home Page . . . . ");

	}

	@Override
	public String getDomainName() {
		
		String domainName = "@yandex.ru";
		return domainName;
		
	}

}
