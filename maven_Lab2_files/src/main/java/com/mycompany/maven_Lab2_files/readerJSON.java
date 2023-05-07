package com.mycompany.maven_Lab2_files;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.File;
import java.util.ArrayList;

public class readerJSON implements Reader {

    protected ArrayList<Reactor> reactorList = new ArrayList();
    Reactor currentReactor;

    @Override
    public ArrayList<Reactor> readFile(String path)
    {
        try {
            File file = new File(path);
            JsonParser jsonParser = new JsonFactory().createParser(file);
            
            while(jsonParser.nextToken() != JsonToken.END_OBJECT) 
            {
                String current_name =  jsonParser.getCurrentName();
                
                if("name".equals(current_name))
                {
                    this.currentReactor = new Reactor();
                    jsonParser.nextToken();
                    currentReactor.setName(jsonParser.getValueAsString());
                }
                if ("burnup".equals(current_name))
                {
                    jsonParser.nextToken();
                    currentReactor.setBurnup(jsonParser.getFloatValue());
                }
                if ("kpd".equals(current_name))
                {
                    jsonParser.nextToken();
                    currentReactor.setKpd(jsonParser.getFloatValue());
                }
                if ("enrichment".equals(current_name))
                {
                    jsonParser.nextToken();
                    currentReactor.setEnrichment(jsonParser.getFloatValue());
                }
                if ("termal_capacity".equals(current_name))
                {
                    jsonParser.nextToken();
                    currentReactor.setTermal_capacity(jsonParser.getFloatValue());
                }
                if ("electrical_capacity".equals(current_name)) {
                    jsonParser.nextToken();
                    currentReactor.setElectrical_capacity(jsonParser.getFloatValue());
                    
                } 
                if ("life_time".equals(current_name)) {
                    jsonParser.nextToken();
                    currentReactor.setLife_time(jsonParser.getFloatValue());
                }
                if ("first_load".equals(current_name)) {
                    jsonParser.nextToken();
                    currentReactor.setFirst_load(jsonParser.getFloatValue());
                    currentReactor.setSource("JSON");
                    reactorList.add( currentReactor);
                    jsonParser.nextToken();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return reactorList;
    }

}
