
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int ini = 11;
            	if (metodoMio(ini))
System.out.println("Es numero primo");
else
 System.out.println("NO es numero primo");           	 
          	 
for (int x=2;x<1000;x++) {
if (metodoMio(x))
System.out.print(x + " ");                         	 
}         	 
	}
public static boolean metodoMio(int variable){
int fin = 2;
boolean aux=true;
while ((aux) && (fin!=variable)){
if (variable % fin == 0)
aux = false;
fin++;
}
return aux;
  } 	 
    
}
