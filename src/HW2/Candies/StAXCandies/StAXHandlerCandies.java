package HW2.Candies.StAXCandies;

import HW2.Candies.generatedCandies.CandiesType;
import HW2.Candies.generatedCandies.PriceType;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class StAXHandlerCandies {
    private CandiesType currentCandy;
    public List<CandiesType> getAllCandies() throws FileNotFoundException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        Reader reader = new FileReader("C:\\Users\\Artur\\IdeaProjects\\Homework2WebServices\\src\\HW2\\Candies\\candies.xml");
        XMLStreamReader xmlStreamReader = factory.createXMLStreamReader(reader);

        List<CandiesType> candies = new ArrayList<>();
        while (xmlStreamReader.hasNext()) {
            switch (xmlStreamReader.next()) {
                case XMLStreamReader.START_ELEMENT:
                    String element = xmlStreamReader.getName().toString();
                    switch (element){
                        case"candies":
                            currentCandy = new CandiesType();
                            currentCandy.setPrice(new PriceType());
                            break;
                        case"price":
                            currentCandy.getPrice().setCurrency(xmlStreamReader.getAttributeValue(0));
                            currentCandy.getPrice().setValue(Integer.parseInt(xmlStreamReader.getElementText()));
                            break;
                        case"taste":
                            currentCandy.setTaste(xmlStreamReader.getElementText());
                            break;
                        case"quantity":
                            currentCandy.setQuantity(Integer.parseInt(xmlStreamReader.getElementText()));
                            candies.add(currentCandy);
                            currentCandy = null;
                            break;
                    }
                    case XMLStreamConstants.END_ELEMENT:
            }
        }
       return candies;
    }


}
