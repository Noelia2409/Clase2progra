
package com.mycompany.ejercisio1;

public class Ejercisio1 {

    public static void main(String[] args) {
        Character homero = new Character ("homero", 39, 'M', "A la grande le puse Lisa");
          homero.saySomething();
        
          Character bart=new Character ("bart", 10, 'M', "Ayy caramba");
          bart.saySomething();
          
    }
    
    
    static class Character{
    String name;
    int age;
    char gender;
    String phrase;

        public  Character(String name, int age, char gender, String phrase) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.phrase= phrase;
        }
    
    void saySomething(){
        System.out.println(this.phrase);
        
    }
    }
}
