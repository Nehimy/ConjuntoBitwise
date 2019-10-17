//chmod 777 run
import Parte_Lógica.Bitwise;

public class ConjuntoBitwise{
  Bitwise [] Conjunto;
  int dim;

  //Constructor
  public ConjuntoBitwise(int cantidad){
    
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
  
  //Clase pincipal
  public static void main(String[] args){  
  
    
  }
  
  }
