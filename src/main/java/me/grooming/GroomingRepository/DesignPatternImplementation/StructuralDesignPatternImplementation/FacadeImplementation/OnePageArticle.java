package me.grooming.GroomingRepository.DesignPatternImplementation.StructuralDesignPatternImplementation.FacadeImplementation;

public class OnePageArticle {
	
	private PageHeader pageHeader;
	private PageTitle pageTitle;
	private PageFooter pageFooter;
	private PageContent pageContent;
	
	public PageHeader getPageHeader() {
		
		return pageHeader;
		
	}
	
	public void setPageHeader(PageHeader pageHeader) {
		
		this.pageHeader = pageHeader;
		
	}
	
	public PageTitle getPageTitle() {
		
		return pageTitle;
		
	}
	
	public void setPageTitle(PageTitle pageTitle) {
		
		this.pageTitle = pageTitle;
		
	}
	
	public PageFooter getPageFooter() {
		
		return pageFooter;
		
	}
	
	public void setPageFooter(PageFooter pageFooter) {
	
		this.pageFooter = pageFooter;
		
	}
	
	public PageContent getPageContent() {
		
		return pageContent;
		
	}
	
	public void setPageContent(PageContent pageContent) {
		
		this.pageContent = pageContent;
		
	}

}