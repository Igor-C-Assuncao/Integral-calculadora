

public class IntegralFunc{                                                    
    
    
        public static void main(String args[]){
                                                 
           Funcao function;                                   
           function = new Funcao();
    
          
           double a = 2 ;                                           
           double b = 5 ;
           int n = 200 ;
           // aplicacao do metodo de simpson
           double result = function.IntSimpson(a,b,n);
    
           // Show results
           System.out.println("Integral is: " + result);        
        }
    }
    

