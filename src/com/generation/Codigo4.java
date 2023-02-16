package com.generation;
//Importación del scanner
import java.util.Scanner;

public class Codigo4 {
	//se agrega system.in entre los paréntesis
	 Scanner s = new Scanner(System.in);
	 
	 
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    //se eliminó un scanner innecesario 
	    String j2 = s.nextLine(System.in);{//Se agregó una llave
	    
	    if (j1 == j2) { //se eliminó un paréntesis extra
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }

	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;
	          } //faltaba llave de cierre
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    //se eliminó una llave de cierre
	  

	 
	      }
	    }
}
