package me.grooming.GroomingRepository.SOLIDPrinciplezWorks.DependencyInversionWorks;

import java.util.List;

public class SingleRuledNotebook {

	private List<Page> pages;
	private boolean isFilled;

	public List<Page> getPages() {

		return pages;

	}

	public void setPages(List<Page> pages) {

		this.pages = pages;

	}

	public int getCurrentPageNumber() {

		int currentPageNumber = 1;

		for (Page currentPage : pages) {

			if (currentPage.isFilled() == false)
				break;

			currentPageNumber++;

		}

		return currentPageNumber;

	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

}