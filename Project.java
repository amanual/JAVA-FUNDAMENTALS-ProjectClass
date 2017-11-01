
import java.util.*;
public class Project{
    private String name;
    private String description;

    public Project(){    
        this("", "");    
    }
    public Project(String name){
        this.name = name;
        
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
        
    }

    public String elevatorPitch(){   
        System.out.println(this.name + " : " + this.description);   
        return this.name + " : " + this.description;
    }
    //getter
    public String getName(){
        return name;
    }
    public String getDesc(){
        return description;
    }
    public String getNameAndDesc(){
        return name + " : " + description;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setDesc(String desc){
        this.description = desc;
    }
    public void setNameDesc(String name, String desc){
        this.name = name;
        this.description = desc;
    }
   

}