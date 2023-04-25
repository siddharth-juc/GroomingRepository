package me.grooming.GroomingRepository.DesignPatternImplementation.StructuralDesignPatternImplementation.FacadeImplementation;

public class ArticleWritingFacade {
	
	public static OnePageArticle writeArticle() {
		
		OnePageArticle onePageArticle = new OnePageArticle();
		
		onePageArticle.setPageHeader(new PageHeader("25-04-2023"));
		onePageArticle.setPageTitle(new PageTitle("Research & Learning"));
		onePageArticle.setPageContent(new PageContent("To be completed"));
		onePageArticle.setPageFooter(new PageFooter("/-"));
		
		return onePageArticle;
		
	}

}