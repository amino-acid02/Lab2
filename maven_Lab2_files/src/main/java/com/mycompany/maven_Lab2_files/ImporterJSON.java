package com.mycompany.maven_Lab2_files;

import java.util.ArrayList;

public class ImporterJSON extends Importer{
    
    public ImporterJSON() 
    {
        setReader(new readerJSON());
    }
    
    @Override
    public ArrayList<Reactor> getReactors(String path) {
        try {
            return getReader().readFile(path);
        } catch (Exception e) {
            return getNeighbour().getReactors(path);
        }
    }
    
}
