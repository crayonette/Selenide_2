import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubSolutionsTest {
    @Test
    void enterprisePage () {
        // Open Github homepage.
        open("https://github.com");
        // Select the "enterprise" category from the "solutions" dropdown menu using hover command
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        // Confirm that the correct page is opened
        $(".h1-mktg").shouldHave(Condition.text("Build like the best"));


    }
}
