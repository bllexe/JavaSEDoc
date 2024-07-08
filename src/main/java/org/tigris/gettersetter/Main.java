package org.tigris.gettersetter;

public class Main {

    public static void main(String[] args) {

        //Setters and Getters allow for an object to contain private variables which can be accessed and changed with restrictions
    }

    private String name;

    public String getName(){
       if(name.length() < 3) {
           return "name is too short";
       }else return name;
    }

    public void setName(String name){
        if(name != null && name.length() > 2){// validation
            this.name = name;
        }
    }
}
