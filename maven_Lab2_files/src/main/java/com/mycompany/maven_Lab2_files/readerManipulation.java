package com.mycompany.maven_Lab2_files;

import java.util.ArrayList;

public class readerManipulation {
    private importerBuilder builder = new importerBuilder();
    
    public ArrayList<Reactor> importData(String filePath) {
        ArrayList<Reactor> reactorList = new ArrayList<>();
        reactorList = builder.getData(filePath);
        return reactorList;
    }
}
