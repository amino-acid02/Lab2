package com.mycompany.maven_Lab2_files.database;
//обработка ошибок
public class FixerExcel {

    public String fix(String value, int col)
    {
        String new_value = value;
      
        if(value.equals("AGR") & col == 7)
        {
            new_value = "MAGNOX";
            return new_value;
        }
        if(value.equals( "CNP-1000") & col == 7)
        {
            new_value = "CPR-1000";
            return new_value;
        }
        if(value.indexOf("PWR") != -1)
        {
            new_value = "PWR";
            return new_value;
        }
        if(value.indexOf("VVER") != -1)
        {
            new_value = "VVER-1000";
            return new_value;
        }
        return new_value;
    }
    
}
