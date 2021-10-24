package test;

import org.testng.annotations.Test;
import page.SearchPage;

public class JobStreetTest {

    private final SearchPage searchPage = new SearchPage();

    @Test
    public void jobStreetTest() {
        String text = "QA Engineer";
        String COMPUTER_INFORMATION_TECHNOLOGY = "Computer/Information Technology";
        String IT_SOFTWARE = "IT-Software";

        searchPage.goToJoBStreetWebsite();
        searchPage.insertTextIntoSearchBox(text);
        searchPage.selectAllJobSpecialization();
        searchPage.selectCheckbox(COMPUTER_INFORMATION_TECHNOLOGY);
        searchPage.selectCheckbox(IT_SOFTWARE);
        searchPage.searchResult();
        searchPage.checkIfTextIsEqual();

    }

}
