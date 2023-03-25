package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.net.URL;

public class JsonToXmlConverter {

    public static void main(String[] args) throws IOException {
        String url = "https://en.wikipedia.org/w/api.php?action=query&format=json&list=search&srsearch=Raiffeisen&srlimit=10";

        // Učitavanje JSON-a sa Wikipedije
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readValue(new URL(url), JsonNode.class);

        // Konverzija JSON-a
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String xml = xmlMapper.writeValueAsString(jsonNode);

        // Ispisivanje XML-a
        System.out.println(xml);
    }
}
