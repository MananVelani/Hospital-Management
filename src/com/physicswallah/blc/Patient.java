package com.physicswallah.blc;

public class Patient {
    private int id;
    private String name;
    private String gender;
    private int age;
    private static int idCounter=1;
    public Patient(String name,String gender,int age){
        this.id=idCounter++;
        this.name= name;
        this.gender=gender;
        this.age=age;

    }
    public int getId(){
        return id;
    }
    @Override
    public String toString(){
        return "Patient Id:"+id+" , Name:"+name+ " , Gender:"+gender+" ,Age:"+age;
    }
}
