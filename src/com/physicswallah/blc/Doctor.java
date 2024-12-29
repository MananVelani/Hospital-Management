package com.physicswallah.blc;

public class Doctor {
    private int id;
    private String name;
    private String speciality;
    private static int idCounter=1;
    public Doctor(String name,String speciality){
        this.id=idCounter++;
        this.name= name;
        this.speciality=speciality;

    }
    public int getId(){
        return id;
    }
    @Override
    public String toString(){
        return "Doctor Id:"+id+" , Name:"+name+ " , speciality:"+speciality;
    }
}
