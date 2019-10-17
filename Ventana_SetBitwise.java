/*
-https://darkbyteblog.wordpress.com/2011/01/06/java-las-clausulas-package-e-import/
*/
import Parte_Lógica.ConjuntoBitwise;

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JOptionPane;


public class Ventana_SetBitwise{
  /*-----------*/
  /* Atributos */
  /*-----------*/
  /*oooooooooooooooooooooooooooooooooo*/
  //Set = Conjunto en ingles
  private ConjuntoBitwise SetBits = new ConjuntoBitwise();
  //private Polinomio A = new Polinomio();
  
  /*oooooooooooooooooooooooooooooooooo*/
  //Clase pincipal
  public static void main(String[] args){  
    new Ventana_SetBitwise();
  }
  
  //Constructor De la Ventana
  public Ventana_SetBitwise(){
    System.out.println("Hey");
  }
}
