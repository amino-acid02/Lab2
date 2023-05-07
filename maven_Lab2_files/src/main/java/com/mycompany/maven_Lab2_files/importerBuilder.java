package com.mycompany.maven_Lab2_files;

import java.util.ArrayList;

public class importerBuilder {
    private Importer ImporterXML;
    private Importer ImporterYAML;
    private Importer ImporterJSON;
    private Importer ImporterNULL;

    public ArrayList<Reactor> getData(String path){
        setParam();
        return ImporterJSON.getReactors(path);
    }

    private void setParam() {
        this.ImporterXML = new ImporterXML();
        this.ImporterYAML = new ImporterYAML();
        this.ImporterJSON = new ImporterJSON();
        this.ImporterNULL = new ImporterNULL();

        ImporterJSON.setNeighbour(ImporterYAML);
        ImporterYAML.setNeighbour(ImporterXML);
        ImporterXML.setNeighbour(ImporterNULL);
    }
}
