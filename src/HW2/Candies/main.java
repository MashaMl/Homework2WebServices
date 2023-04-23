package HW2.Candies;

import HW2.Candies.StAXCandies.StAXHandlerCandies;
import HW2.Candies.generatedCandies.CandiesType;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.util.List;

public class main {
    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
        StAXHandlerCandies stAXHandlerCandies = new StAXHandlerCandies();
        List<CandiesType> candies = stAXHandlerCandies.getAllCandies();
        for(CandiesType candy: candies) {
            candy.show();
        }
    }
}
