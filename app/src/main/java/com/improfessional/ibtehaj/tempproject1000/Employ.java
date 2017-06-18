package com.improfessional.ibtehaj.tempproject1000;

/**
 * Created by ibtehaj on 6/15/2017.
 */

public class Employ {

    private String name, designation;

    Employ(){ /*Empty Adapter */  }
    Employ(String name , String designation){

        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}


