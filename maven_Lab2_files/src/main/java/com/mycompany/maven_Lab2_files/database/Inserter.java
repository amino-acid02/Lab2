package com.mycompany.maven_Lab2_files.database;

import com.mycompany.maven_Lab2_files.Reactor;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Inserter extends ConnectionRunners {
    String path;
    String mode;
    public String selectedFileMode ;
    ArrayList<Reactor> sourseOther;
    
    String unprepared_SQL1 = "INSERT INTO public.reactors (id, name, burnup, kpd, enrichment, electrical_capacity, termal_capacity, life_time, first_load)\n" +
"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    String unprepared_SQL2 = "INSERT INTO public.regions (id, region_name)\n" + "VALUES (?, ?);";
    String unprepared_SQL3 = "INSERT INTO public.countries (id, country_name,subregion,region,region_id)\n" + "VALUES (?, ?, ?, ?, ?);";
    String unprepared_SQL4 = "INSERT INTO public.companies (id, companies_name,full_name,country_id)\n" + "VALUES (?, ?, ?, ?);";
    String unprepared_SQL5 = "INSERT INTO public.sites (id, npp_name, place,owner_id,operator,builder)\n" + "VALUES (?, ?, ?, ?, ?, ?);";
    String unprepared_SQL6 = "INSERT INTO public.units (id,code,unit_name,site,status,type,model,class,ru_design,operator,nsss_supplier,thermal_capacity,gross_capacity,net_capacity,construction_start,commercial_operation,date_shutdown,enrichment,load_factor)\n" +
"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";  
    ArrayList<String> unprepared_SQL = new ArrayList<>();       
    ArrayList<String> tables = new ArrayList<>();

    public Inserter(String mode, String source)
    {
        this.path = source;
        this.mode =  "auto";
        this.selectedFileMode = "excel";
    }
    
    public Inserter(String mode, ArrayList<Reactor> sourseOther)
    {
        this.path = path;
        this.mode = "auto";
        this.selectedFileMode = "other";
        this.sourseOther = sourseOther;
    }
    
    @Override
    public void run()
    {
        try {
            Connection engine = DriverManager.getConnection(this.url, this.user, this.password);
            
            Collections.addAll(unprepared_SQL, unprepared_SQL2,unprepared_SQL3,unprepared_SQL4,unprepared_SQL5,unprepared_SQL6);
            Collections.addAll(tables, "regions","countries","companies","sites","units");
            
            if(this.selectedFileMode == "other")
            { 
                this.preparator = new SQL_Preparator(this.selectedFileMode, this.sourseOther);
                PreparedStatement query_prepared = this.preparator.getPreparedSQL_insert(this.unprepared_SQL1, engine, "reactors"); /// GET UNPREPARED ROWS
                query_prepared.executeBatch();
            }
            else if(this.selectedFileMode == "excel")
            {
                this.preparator = new SQL_Preparator(this.selectedFileMode, this.path);
                for(int i=0; i<unprepared_SQL.size(); i++)
                {
                    PreparedStatement query_prepared = this.preparator.getPreparedSQL_insert(this.unprepared_SQL.get(i), engine, tables.get(i)); /// GET UNPREPARED ROWS
                    query_prepared.executeBatch();
                }
            }
            
            engine.close();   
        } catch (Exception e) {
            JOptionPane.showMessageDialog (null, "Файл уже выбран", "Oшибка", JOptionPane.ERROR_MESSAGE);
        }
    }

}
