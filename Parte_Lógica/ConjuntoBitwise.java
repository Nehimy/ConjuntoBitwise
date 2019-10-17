//chmod 777 run
package Parte_Lógica;
import java.util.Scanner;

public class ConjuntoBitwise{
  Bitwise [] Conjunto;
  int dim;

  //Constructor
  public ConjuntoBitwise(){
    int cantidad = 100;
    Bitwise [] Conjunto;
    int dim;
    
    int NumberOfBitwise = cantidad / 32;
    if((cantidad % 32) != 0){
      NumberOfBitwise++;
    }
    
    Conjunto = new Bitwise [NumberOfBitwise];
    dim = cantidad;
    
    for( int i = 0; i < NumberOfBitwise; i++){
      Conjunto [i] = new Bitwise();
    }
    System.out.println(String.valueOf(dim));
    
  }
  
 
  
}
