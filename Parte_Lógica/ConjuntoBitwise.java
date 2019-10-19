//chmod 777 run
package Parte_Lógica;
import java.util.Scanner;

public class ConjuntoBitwise{
  Bitwise [] Conjunto;
  int dim;

  //Constructor
  public ConjuntoBitwise(int cantidad){
    //int cantidad = 100;
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
    //System.out.println(String.valueOf(dim));
    
  }
  
  /*-----------------------------------------*/
  /*-------------- Metodos ------------------*/
  /*-----------------------------------------*/
  //                                   2    1
  //Obtener el número de bitwise C [ 00000 00000 ]
  private int GetNumeroDe_Bitwise(int Position){
    int aux = (Position -1) / 32;
    return aux;
  }
  //                             54321 54321
  //Obtener el número de bit C [ 00000 00000 ]
  private int GetNumeroDe_Bit(int Position){
    int aux = (Position -1 % 32) + 1;
    return aux;
  }
  
  // Insertar en el conjunto de bitwise
  public void Insertar(int elemento){
    if(elemento <= dim){
      int NumberOfBitwise = GetNumeroDe_Bitwise(elemento);
      int NumberOfbit = GetNumeroDe_Bit(elemento);
      Conjunto[NumberOfBitwise].Encender(NumberOfbit);
    }
  }
  
  // Eliminar en el conjunto de bitwise
  public void Eliminar(int elemento){
    if(elemento <= dim){
      int NumberOfBitwise = GetNumeroDe_Bitwise(elemento);
      int NumberOfbit = GetNumeroDe_Bit(elemento);
      Conjunto[NumberOfBitwise].Apagar(NumberOfbit);
    }
  }
  
  public boolean Pertenece(int elemento){
    int NumberOfBitwise = GetNumeroDe_Bitwise(elemento);
    int NumberOfbit = GetNumeroDe_Bit(elemento);
    //Bitwise a = new ConjuntoBitwise();
    //a = Conjunto[NumberOfBitwise];
    boolean aux = (this.GetNumeroDe_Bit(NumberOfbit) == 1);
    return aux;
  }
  
  public void Union(ConjuntoBitwise A, ConjuntoBitwise B){
    for(int i = 1; i <= A.dim; i++){
      if(Pertenece(i)){
        Insertar(i);
      }
    }
  }
  
  public void Intersection(ConjuntoBitwise A, ConjuntoBitwise B){
    for(int i = 1; i <= A.dim; i++){
      if(B.Pertenece(i)){
        Insertar(i);
      }
    }
  }
  
  public String ObtenerTodo(){
    String cadena = "x = ";
    for (int i = 1; dim >= i; i++){
      if(Pertenece(i)){
        cadena = cadena + Conjunto[i] + ", ";
      }
      
    }
    return cadena;
  }
  
}
