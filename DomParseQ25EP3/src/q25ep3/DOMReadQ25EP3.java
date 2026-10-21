package q25ep3;

import java.io.File;
import java.io.IOException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;

import java.io.File;

public class DOMReadQ25EP3 {

	public static void main(String[] args) throws IOException,
			ParserConfigurationException, SAXException {
		File xmlFile = new File("Q25EP3_XML.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		// A parse() metódus elemzi és betölti az XML fájlt
		Document doc = dBuilder.parse(xmlFile);

		// A dokumentum normalizálása segít a helyes eredmény elérésében
		doc.getDocumentElement().normalize();

		System.out.println("Gyökér elem: "
				+ doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getElementsByTagName("etterem");

		for (int i = 0; i < nList.getLength(); i++) {
			// Lekérjük a lista aktuális elemét
			Node nNode = nList.item(i);
			System.out.println("\nAktuális elem: " + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				// Aktuális elem Elementté konvertálása
				Element eElement = (Element) nNode;

				String id = eElement.getAttribute("ekod");

				Node node1 = eElement.getElementsByTagName("nev").item(0);
				String name = node1.getTextContent();

				Node node2 = eElement.getElementsByTagName("varos").item(0);
				String city = node2.getTextContent();

				Node node3 = eElement.getElementsByTagName("utca").item(0);
				String street = node3.getTextContent();

				Node node4 = eElement.getElementsByTagName("hazszam").item(0);
				String number = node4.getTextContent();

				Node node5 = eElement.getElementsByTagName("csillag").item(0);
				String stars = node5.getTextContent();

				// Cim gyerekelemeinek összefûzése egy stringbe
				String adr = city + ", " + street + " utca " + number + ".";

				// Formázva kiiratjuk a lekért információkat az adott elemrõl
				System.out.println("Étterem ID: " + id);
				System.out.println("Név: " + name);
				System.out.println("Cím: " + adr);
				System.out.println("Csillag: " + stars);
				
				
				nList = doc.getElementsByTagName("foszakacs");


				}
			for (int i1 = 0; i < nList.getLength(); i1++) {
				System.out.println("\nAktuális elem: " + nNode.getNodeName());
				
				Node fNode = fElement.getElementsByTagName("foszakacs").item(0);
				if (fNode.getNodeType() == Node.ELEMENT_NODE) {
					Element fElement = (Element) fNode;
					String fkod = fElement.getAttribute("fkod");

					Node fNode1 = fElement.getElementsByTagName("nev").item(0);
					String fName = fNode1.getTextContent();

					Node fNode2 = fElement.getElementsByTagName("eletkor").item(0);
					String age = fNode2.getTextContent();

					Node fNode3;
					String edu = "";
					
					for(int j=0; j< eElement.getElementsByTagName("vegzettsev").getLength();j++);
			}
		}
	}
}
