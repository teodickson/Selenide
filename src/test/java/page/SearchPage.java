package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {

    public void goToJoBStreetWebsite() {
        open("https://www.jobstreet.com.sg/");
    }

    public void insertTextIntoSearchBox(String value) {
        $("#searchKeywordsField").setValue(value);
    }

    public void selectAllJobSpecialization() {
        $(byText("All Job Specializations")).click();
    }

    public void selectCheckbox(String jobType) {
        SelenideElement computerInformationTechnologyCheckbox = $(byXpath("//input[./following-sibling::div//span[text()='" + jobType + "']]"));
        computerInformationTechnologyCheckbox.click();
    }

    public void searchResult() {
        SelenideElement searchButton = $(byXpath("//button[@data-automation='searchSubmitButton']"));
        searchButton.click();
    }

    public void checkIfTextIsEqual() {
        SelenideElement searchResultBar = $(byXpath("//div[@data-automation='searchResultBar']"));
        SelenideElement strongText = searchResultBar.find(byXpath(".//strong"));
        strongText.shouldBe(Condition.exactText("1-30"));
    }
}
