//chmod 777 run
package Parte_Lógica;
import java.util.Scanner;

public class ConjuntoBitwise{
  Bitwise [] Conjunto;
  int dim;
  int NumberOfbit;
  int NumberOfBitwise;

  //Constructor
  public ConjuntoBitwise(int cantidad){
    
    int NumberOfBitwise = cantidad / 32;
    if((cantidad % 32) != 0){
      NumberOfBitwise++;
    }
    Conjunto = new Bitwise [NumberOfBitwise];
    dim = cantidad;
    for( int i = 0; i < NumberOfBitwise; i++){
      System.out.println(String.valueOf(i));
      Conjunto [i] = new Bitwise(); 
    }
    
  }
  
  /*-----------------------------------------*/
  /*-------------- Metodos ------------------*/
  /*-----------------------------------------*/
  //                                   2    1
  //Obtener el número de bitwise C [ 00000 00000 ]
  public int GetNumeroDe_Bitwise(int Position){
    int aux = (Position -1) / 32;
    return aux;
  }
  //                             54321 54321
  //Obtener el número de bit C [ 00000 00000 ]
  public int GetNumeroDe_Bit(int Position){
    int aux = (Position -1 % 32) + 1;
    return aux;
  }
  
  // Insertar en el conjunto de bitwise
  public void Insertar(int elemento){
    //System.out.println("y");
    if(elemento <= dim){
      int NumberOfBitwise = GetNumeroDe_Bitwise(elemento);
      int NumberOfbit = GetNumeroDe_Bit(elemento);
      Conjunto[NumberOfBitwise].Encender(NumberOfbit);
      
      //System.out.println(Integer.toString(NumberOfBitwise));
      //System.out.println(Integer.toString(NumberOfbit));
      
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
    
    int a = Conjunto[NumberOfBitwise].GetBit(NumberOfbit);
    boolean aux = (a == 1);
    //System.out.println(String.valueOf(aux));
    return aux;                                   
  }
  
  public void Union(ConjuntoBitwise A, ConjuntoBitwise B){
    for(int i = 1; i <= A.dim; i++){
      if(A.Pertenece(i)){
        Insertar(i);
      }
    }
    for(int i = 1; i <= B.dim; i++){
      if(B.Pertenece(i)){
        Insertar(i);
      }
    }
  }
  
  public void Intersection(ConjuntoBitwise A, ConjuntoBitwise B){
    for(int i = 1; i <= A.dim; i++){
      if(B.Pertenece(i) && A.Pertenece(i)){
        Insertar(i);
      }
    }
  }
  
  public String ObtenerTodo(){
    String cadena = "x = ";
    for (int i = 1; i <= dim; i++){
      //System.out.println(i);
      if(Pertenece(i)){
        //System.out.println("Llego hasta aquí");
        cadena = cadena + Integer.toString(i) + ", ";
      }
    }
    return cadena;
  }
  
}
