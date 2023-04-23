package HW2.Greenhouse;

import HW2.Greenhouse.StAXGreenhouse.StAXHandler;
import HW2.Greenhouse.generatedGreenhouse.GreenhouseType;
import HW2.Greenhouse.generatedGreenhouse.PlantType;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException, ParserConfigurationException, SAXException, IOException, XMLStreamException {
//        SAXParserFactory factory = SAXParserFactory.newInstance();
//        SAXParser saxParser = factory.newSAXParser();
//
//        File file = new File("C:\Users\Artur\IdeaProjects\Homework2WebServices\src\HW2\Greenhouse\greenhouse.xml");
//        SAXHandler saxHandler = new SAXHandler();
//        if(file.exists()) {
//            saxParser.parse(file, saxHandler);
//            GreenhouseType greenhouseSAX = saxHandler.getGreenhouse();
//            greenhouseSAX.show();
//        }

//        DOMHandler domHandler = new DOMHandler();
//        GreenhouseType greenhouseDOM = domHandler.getGreenhouse();
//        greenhouseDOM.show();

        StAXHandler stAXHandler = new StAXHandler();
        GreenhouseType greenhouse = stAXHandler.getGreenhouse();
        greenhouse.show();


        Collections.sort(greenhouse.getPlant());
        greenhouse.show();



        /*String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<greenhouse xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "            xsi:noNamespaceSchemaLocation=\"greenhouse.xsd\">\n" +
                "    <plant>\n" +
                "        <name>Plant1</name>\n" +
                "        <soil>Black soil</soil>\n" +
                "        <origin>Ukraine</origin>\n" +
                "        <visual_parameters>\n" +
                "            <stem_color>Brown</stem_color>\n" +
                "            <leafs_color>Light green</leafs_color>\n" +
                "            <medium_size unit=\"meter\">2</medium_size>\n" +
                "        </visual_parameters>\n" +
                "        <growing_tips>\n" +
                "            <temperature unit=\"celsius\">15</temperature>\n" +
                "            <lighting>Light-loving</lighting>\n" +
                "            <watering unit=\"ml/week\">600</watering>\n" +
                "        </growing_tips>\n" +
                "    </plant>\n" +
                "    <plant>\n" +
                "        <name>Plant2</name>\n" +
                "        <soil>Black soil</soil>\n" +
                "        <origin>America</origin>\n" +
                "        <visual_parameters>\n" +
                "            <stem_color>Brown</stem_color>\n" +
                "            <leafs_color>Dark green</leafs_color>\n" +
                "            <medium_size unit=\"meter\">3</medium_size>\n" +
                "        </visual_parameters>\n" +
                "        <growing_tips>\n" +
                "            <temperature unit=\"celsius\">25</temperature>\n" +
                "            <lighting>Not light-loving</lighting>\n" +
                "            <watering unit=\"ml/week\">500</watering>\n" +
                "        </growing_tips>\n" +
                "    </plant>\n" +
                "    <plant>\n" +
                "        <name>Plant3</name>\n" +
                "        <soil>Red soil</soil>\n" +
                "        <origin>Uganda</origin>\n" +
                "        <visual_parameters>\n" +
                "            <stem_color>Red</stem_color>\n" +
                "            <leafs_color>Rose</leafs_color>\n" +
                "            <medium_size unit=\"meter\">1</medium_size>\n" +
                "        </visual_parameters>\n" +
                "        <growing_tips>\n" +
                "            <temperature unit=\"celsius\">30</temperature>\n" +
                "            <lighting>Light-loving</lighting>\n" +
                "            <watering unit=\"ml/week\">500</watering>\n" +
                "        </growing_tips>\n" +
                "    </plant>\n" +
                "</greenhouse>";
        Pattern pattern = Pattern.compile(">.+<");
        Matcher matcher = pattern.matcher(xml);
        while (matcher.find()){
            System.out.println(xml.substring(matcher.start(), matcher.end()));
        }
        */


    }
}