package com.mycompany.maven_Lab2_files;

import java.util.ArrayList;

public class ImporterYAML extends Importer{
    public ImporterYAML() 
    {
        setReader(new readerYAML());
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
