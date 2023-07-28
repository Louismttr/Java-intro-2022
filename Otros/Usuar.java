import java.util.*;
public class Usuar
{
   public static void main(String[] args)
   {
       Scanner Entrada=new Scanner(System.in);
       String Nombre;
       int Año;
       boolean Carnet=true;
       int edad;
       String op;

       System.out.print("\nIntroduzca su nombre: ");
       Nombre=Entrada.nextLine();
       System.out.print("\nIntroduzca el año de nacimiento: ");
       Año=Entrada.nextInt();
       System.out.print("\nPresenta carnnet de conducir.....si o no? ");
       op=Entrada.nextLine();
       if(op.equalsIgnoreCase("si"))
       {
        Carnet=true;
       }
       else if (op.equalsIgnoreCase("no"))
       {
           Carnet=false;
       }
       
       if(Año<=2004)
       {
        System.out.println("El usuario: " + Nombre);
        edad=2022-Año;
        System.out.println("Del año: " + Año + " Con edad de: " + edad );
        System.out.println("Tiene autorización para conducir");
       }
       else
       {
        edad=2022-Año;
        System.out.print("El usuario " + Nombre + " de la edad de: " + edad + " es menor, por tanto no esta autorizado a conducir");
       }
   }
}