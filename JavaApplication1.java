
package javaapplication1;


import java.util.*;
        
public class JavaApplication1 {

    
    public static void main(String[] args) {
        double x = 100, v = 0, p = 0, t = 0;
        boolean fin = false;
        int n = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList <String> nombre = new ArrayList();
        ArrayList <Double> velocidad = new ArrayList();
        ArrayList <Double> tiempo = new ArrayList(); 
        while(!fin){
            System.out.println("ingrese el nombre del estudiante "+n);
            nombre.add(sc.next());
            System.out.println("ingrese la velocidad del estudiante "+n);
            v = sc.nextDouble();
            t = x/v;
            p += t;
            n++;
            velocidad.add(v);
            tiempo.add(t);
            System.out.println("agregar mas? si,no");
            String r = sc.next();
            if ( r == "no" || r == "No" || r == "NO" ){
                fin = true;
            }
        } //fuera del while
        double prom = (p/velocidad.size());
        double g = velocidad.get(0);
        int mp = 0;
        String s = "es el mas rapido";
        for (int i = 0 ; i < velocidad.size(); i++){
            if (velocidad.get(i) > g){
                g = velocidad.get(i);
            }
        }
        //for (int j = 0;j>velocidad.size())
        for (int j = 0 ; j < velocidad.size() ; j++){
            if (velocidad.get(j) == g){
                System.out.println("el estudiante "+nombre.get(j)+s);
            }
            if (velocidad.get(j)>prom){
                mp++; //mayor que el promedio
            }
            System.out.println((j+1)+" "+nombre.get(j)+" velocidad: "+velocidad.get(j)+" tiempo: "+tiempo.get(j));
        }
        System.out.println("el promedio es: "+prom);
        System.out.println("mas rapido que el promedio hay: "+mp);       
    }
    
}
