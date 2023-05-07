package com.mycompany.maven_Lab2_files.database;

public abstract class ConnectionRunners {
    
    public SQL_Preparator preparator;
    protected String url = "jdbc:postgresql://localhost:5432/postgres";
    protected  String user = "postgres";
    protected  String password = "1234";
   
    public void run()
    {
        //разные реализации для Creator и Inserter
    }
       
}
