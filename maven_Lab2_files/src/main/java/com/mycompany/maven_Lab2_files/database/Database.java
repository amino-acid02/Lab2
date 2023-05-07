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
    private  String mode = "auto";
    
    
    public  Database(String mode) 
    {
        this.mode = mode;
    }

    public void StartCreate()
    {
        this.creator = new Creator(); 
        this.creator.run();
    }

    public void StartInsert(String sourse)
    {
        Inserter excelInserter = new Inserter(this.mode, sourse);
        excelInserter.run();
    }
    
    public void StartInsert(ArrayList<Reactor> sourse)
    {
        Inserter OtherInserter = new Inserter(this.mode, sourse);
        OtherInserter.run();
    }
   
}
