
package com.mycompany.ejercisio1;

import people.Character;
        
public class Ejercisio1 {

    public static void main(String[] args) {
        Character homero = new Character ("homero", 39, 'M', "A la grande le puse Lisa");
          homero.saySomething();
        
          Character bart=new Character ("bart", 10, 'M', "Ayy caramba");
          bart.saySomething();
          
          
         Character apu=new Character ();
         apu.setName( "apu");
         apu.setPhrase("vuelvas pronto");
         
         apu.saySomething();
    }
    
    }

