

    class Funcao{                                                        

        // define a funcao da integral 
        double f (double x) {                                              
           return Math.pow(x, 2) - 3 * x;
        }
    
        // Metodo de simpson para calculo de integral 
        // a = limite menor 
        // b = limite maior 
        // n = numero 
        double IntSimpson(double a, double b,int n){                       
           
         int i,z;                                                       
           double h,s;                                                    
    
           n=n+n;
           s = f(a)*f(b);
           h = (b-a)/n;                                        
           z = 4;
    
           for(i = 1; i<n; i++){
              s = s + z * f(a+i*h);
              z = 6 - z;
           }
           return (s * h)/3;
        } 
    }  
    
    
   
    

