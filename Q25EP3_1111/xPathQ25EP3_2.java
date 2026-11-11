package q25ep3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XPathQ25EP3 {
    public static void main(String[] args) {

        try {

            File xmlFile = new File("studentNeptunkod.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();

            XPath xPath = XPathFactory.newInstance().newXPath();

            String neptunkod = "/class/hallgato";

            System.out.println("A futás eredménye:");

            NodeList neptunkod1 = (NodeList) xPath.compile(neptunkod).evaluate(document, XPathConstants.NODESET);

            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("student1Q25EP3.xml")));

            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<hallgatok>\n");

            for (int i = 0; i < neptunkod1.getLength(); i++) {
                Node node = neptunkod1.item(i);
                System.out.println("\nAktuális elem: " + (node.getNodeName().equals("hallgato")));

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    
                    String id = element.getAttribute("id");
                    String keresztnev = element.getElementsByTagName("keresztnev").item(0).getTextContent();
                    String vezeteknev = element.getElementsByTagName("vezeteknev").item(0).getTextContent();
                    String becenev = element.getElementsByTagName("becenev").item(0).getTextContent();
                    String kor = element.getElementsByTagName("kor").item(0).getTextContent();
                    
                    System.out.println("Hallgató ID: " + id);
                    System.out.println("Keresztnév: " + keresztnev);
                    System.out.println("Vezetéknév: " + vezeteknev);
                    System.out.println("Becenév: " + becenev);
                    System.out.println("Kor: " + kor);

                    writer.write("\t<hallgato id=\"" + id + "\">\n");
                    writer.write("\t\t<keresztnev>" + keresztnev + "</keresztnev>\n");
                    writer.write("\t\t<vezeteknev>" + vezeteknev + "</vezeteknev>\n");
                    writer.write("\t\t<becenev>" + becenev + "</becenev>\n");
                    writer.write("\t\t<kor>" + kor + "</kor>\n");
                    writer.write("\t</hallgato>\n");
                }
            }

            writer.write("</hallgatok>");
            writer.close();
            System.out.println("\nAz adatok sikeresen kiírva a student1Q25EP3.xml fájlba!");

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}