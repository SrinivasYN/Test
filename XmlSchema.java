package java8Practice;

public class XmlSchema {

    public static void main(String args[]) {
        String xmlschema = "<CD><TITLE>Empire Burlesque</TITLE><ARTIST>Bob Dylan</ARTIST>" +
                "<COUNTRY>USA</COUNTRY><COMPANY>Columbia</COMPANY><PRICE>10.90</PRICE><YEAR>1985</YEAR></CD>";

        String xml[] = xmlschema.split("<");


        /*for (int i = 0; i <= xml[].size(); i++) {

            System.out.println(xml);
        }*/
    }
}

