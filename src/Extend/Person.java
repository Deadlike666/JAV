package Extend;
import PeopleTest.People;

import java.util.Scanner;
public class Person {
    private String ID,name,sex;
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public Person(String ID,String name,String sex){
        this.ID = ID;
        this.name = name;
        this.sex = sex;
    }
    public Person(){
        this.sex = null;
        this.ID = null;
        this.name = null;
    }
    
}
