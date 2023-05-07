package com.mycompany.maven_Lab2_files.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Displayer extends ConnectionRunners{

    private final Vector colNames;
    private final Vector data;
    
    public Displayer(String query) throws SQLException
    {
        Vector columnNames = new Vector();
        Vector data = new Vector();

        Connection engine = DriverManager.getConnection(this.url, this.user, this.password);
        Statement stmt = engine.createStatement();
        ResultSet resultTable = stmt.executeQuery(query);
        ResultSetMetaData md = resultTable.getMetaData();
        int columns = md.getColumnCount();
        
        for(int i = 1; i <= columns; i++)
        {
            columnNames.addElement(md.getColumnName(i));
        }
        while(resultTable.next())
        {
            Vector row = new Vector(columns);
            for(int i = 1; i<= columns; i++)
            {
                    row.addElement(resultTable.getObject(i));
            }
            data.addElement(row);         
        }
        resultTable.close();
        stmt.close();
        engine.close();

        this.colNames =  columnNames;
        this.data =  data;
    }
    
    public Vector getColNames()
    {
        return this.colNames;
    }
    
    public Vector getData(){return this.data;}
    
}
