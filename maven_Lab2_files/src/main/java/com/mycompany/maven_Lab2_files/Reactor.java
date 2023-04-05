package com.mycompany.maven_Lab2_files;

import java.lang.reflect.Field;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public  class Reactor {
    String name;
    Float burnup;
    Float kpd;
    Float enrichment;
    Float electrical_capacity;
    Float termal_capacity;
    Float life_time;
    Float first_load;
    String source;
    
    public void setName(String name) {
        this.name = name;
    }

    public void setBurnup(Float burnup) {
        this.burnup = burnup;
    }

    public void setKpd(Float kpd) {
        this.kpd = kpd;
    }

    public void setEnrichment(Float enrichment) {
        this.enrichment = enrichment;
    }

    public void setElectrical_capacity(Float electrical_capacity) {
        this.electrical_capacity = electrical_capacity;
    }

    public void setTermal_capacity(Float termal_capacity) {
        this.termal_capacity = termal_capacity;
    }

    public void setLife_time(Float life_time) {
        this.life_time = life_time;
    }

    public void setFirst_load(Float first_load) {
        this.first_load = first_load;
    }
    
    public void setSource(String s){
        this.source = s;
    }
    public String getName() {
        return name;
    }

    public Float getBurnup() {
        return burnup;
    }

    public Float getKpd() {
        return kpd;
    }

    public Float getEnrichment() {
        return enrichment;
    }

    public Float getElectrical_capacity() {
        return electrical_capacity;
    }

    public Float getTermal_capacity() {
        return termal_capacity;
    }

    public Float getLife_time() {
        return life_time;
    }

    public Float getFirst_load() {
        return first_load;
    }
    
    public String getSource(){
       return this.source;
    }

    public MutableTreeNode getNode() throws IllegalAccessException
    {
        DefaultMutableTreeNode reactornode = new DefaultMutableTreeNode(this.getName());
        Field[] fields = Reactor.class.getDeclaredFields();
        for(Field field : fields)
        {
            String name_field = field.getName();
            Object value_field = field.get(this).toString();
            String record = name_field + ": " + value_field;
            reactornode.add(new DefaultMutableTreeNode(record));
        }
        
        return reactornode;
    }
}



