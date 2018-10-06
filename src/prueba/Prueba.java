package prueba;
//Nada
import java.text.Normalizer;

public class Prueba {

    public static void main(String[] args) {
        char c,s;
        String aux="";
        String str = "Hólá que hace ";
        String[] cadena=new String[30];
        int x=0;
            
        //Test Danco chupalooo:
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = str.replaceAll("[^\\p{ASCII}(N\u0303)(n\u0303)(\u00A1)(\u00BF)(\u00B0)(U\u0308)(u\u0308)]", "");

        System.out.println(str);
            for (int n = 0; n <str.length(); n ++){
                c = str.charAt (n);

                if(Character.isSpaceChar(c)  ){
                    cadena[x]=aux;
                    x++;
                    aux="";
                }
                else{
                     aux+=Character.toString(c);

                }
            }
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if(cadena[i].equalsIgnoreCase("Hace") && cadena[j].equalsIgnoreCase("Hola")){
                        System.out.println("Mati qlio");
                    }
                    else{
                        continue;
                    }

               }
            }
        
        
    }}
        
    
    

