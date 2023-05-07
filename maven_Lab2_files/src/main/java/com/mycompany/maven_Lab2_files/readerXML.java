package com.mycompany.maven_Lab2_files;

import java.io.FileInputStream;
import java.util.ArrayList;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class readerXML implements Reader {
    
    protected ArrayList<Reactor> reactorList = new ArrayList();
    Reactor currentReactor;

    @Override
    public ArrayList<Reactor> readFile(String path) 
    {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader reader = factory.createXMLEventReader(new FileInputStream(path));
            while(reader.hasNext())
            {
                XMLEvent event = reader.nextEvent();
                if(event.isStartElement())
                {
                    StartElement startElement = event.asStartElement();
                    if(startElement.getName().getLocalPart().equals("reactor"))
                    {
                        currentReactor = new Reactor();
                    } 
                    if(startElement.getName().getLocalPart().equals("name"))
                    {
                        event = reader.nextEvent();
                        currentReactor.setName(event.asCharacters().getData());
                    }
                    if(startElement.getName().getLocalPart().equals("burnup"))
                    {
                        event = reader.nextEvent();
                        currentReactor.setBurnup(Float.parseFloat(event.asCharacters().getData()));
                        
                    }
                    if(startElement.getName().getLocalPart().equals("kpd"))
                    {
                        event = reader.nextEvent();
                        currentReactor.setKpd(Float.parseFloat(event.asCharacters().getData()));
                    }
                    if(startElement.getName().getLocalPart().equals("enrichment"))
                    {
                        event = reader.nextEvent();
                        currentReactor.setEnrichment(Float.parseFloat(event.asCharacters().getData()));
                    }
                    if(startElement.getName().getLocalPart().equals("termal_capacity"))
                    {
                        event = reader.nextEvent();
                        currentReactor.setTermal_capacity(Float.parseFloat(event.asCharacters().getData()));
                    }
                    if(startElement.getName().getLocalPart().equals("electrical_capacity"))
                    {
                        event = reader.nextEvent();
                        currentReactor.setElectrical_capacity(Float.parseFloat(event.asCharacters().getData()));
                    }
                    if(startElement.getName().getLocalPart().equals("life_time"))
                    {
                        event = reader.nextEvent();
                        currentReactor.setLife_time(Float.parseFloat(event.asCharacters().getData()));
                    }
                    if(startElement.getName().getLocalPart().equals("first_load"))
                    {
                        event = reader.nextEvent();
                        currentReactor.setFirst_load(Float.parseFloat(event.asCharacters().getData()));
                    }
                }
                if(event.isEndElement())
                {
                    EndElement endElement = event.asEndElement();
                    if(endElement.getName().getLocalPart().equals("reactor"))
                    {
                        currentReactor.setSource("XML");
                        reactorList.add(currentReactor);
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return reactorList;
    }

}
