package com.mycompany.maven_Lab2_files.database;

import com.mycompany.maven_Lab2_files.Reactor;
import java.util.ArrayList;

/*
использует creator и inserter 
может создавать таблицы и заполнять их
*/

public class Database {

    private Inserter inserter;
    private Creator creator;
    private String mode = "auto";
    
    
    public  Database(String mode) 
    {
        this.mode = mode;
    }

    public void StartCreate()
    {
        this.creator = new Creator(); 
        this.creator.run();
    }

    public void StartInsert(String source)
    {
        Inserter excelInserter = new Inserter(this.mode, source);
        excelInserter.runExcel();
    }
    
    public void StartInsert(ArrayList<Reactor> source)
    {
        Inserter OtherInserter = new Inserter(this.mode, source);
        OtherInserter.run();
    }
   
}
