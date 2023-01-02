import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @Test
    void dragAndDropTest() {
        //Open https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //Use drag and drop command to swap the positions of the rectangles
        $("#column-a").dragAndDropTo($("#column-b"));

        //Confirm that that rectangles have swapped their positions
        $("#column-b").$("header").shouldHave(Condition.text("A"));
    }

    @Test
    void dragAndDropActions() {
        //Open https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //Use the actions command to swap the positions of the rectangles
        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(200, 0).release().perform();

        //Confirm that that rectangles have swapped their positions
        $("#column-b").$("header").shouldHave(Condition.text("A"));
    }


}





