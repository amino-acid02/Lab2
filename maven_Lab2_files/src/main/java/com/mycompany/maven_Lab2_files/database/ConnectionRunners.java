package com.mycompany.maven_Lab2_files.database;

public abstract class ConnectionRunners {
    
    public SQL_Preparator preparator;
    protected String url = "jdbc:postgresql://dpg-chdoc867avj0djiu76l0-a.frankfurt-postgres.render.com:5432/lab3_kt3v";
    protected  String user = "amina";
    protected  String password = "aTBtkIXuxOzOyNWf6QuWBR0kyDfTEdZo";
   
    public void run()
    {
        //разные реализации для Creator и Inserter
    }
       
}
