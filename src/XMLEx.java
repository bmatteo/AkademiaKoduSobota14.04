import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLEx {
    public static void xmlTest() {
        try {


            File fXmlFile = new File("src/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();



            NodeList nList = doc.getElementsByTagName("car");

            Element car1 = (Element) nList.item(0);

            Element engine1 = (Element) car1.getElementsByTagName("engine").item(0);

            String capacity = engine1.getElementsByTagName("capacity").item(0).getTextContent();

            //System.out.println(((Element) car1.getElementsByTagName("engine").item(0)).getElementsByTagName("capacity").item(0).getTextContent());

            System.out.println(capacity);


            /*String brand = car1.
                    getElementsByTagName("capacity").
                    item(0).getTextContent();

            System.out.println(brand);*/



        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
