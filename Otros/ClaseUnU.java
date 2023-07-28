import java.util.*;
public class ClaseUnU
{
   public static int menor(int a[])
   {
      int vmenor;
      vmenor= a[0];
      for(int i=0; i<a.length;i++)
      {
         if(a[i]<vmenor)
         {
           vmenor=a[i];
         }
      }
      return vmenor;
   }
   public static int mayor (int a[])
   {
      int vmayor;
      vmayor=a[a.length-1];
      for(int i=0; i<a.length;i++)
      {
        if(a[i]>vmayor)
        {
          vmayor=a[i];
        }
      }
      return vmayor;
   }
   public static int buscar(int a[], int nutr)
   {
      int posicion=-1;
      for(int i=0;i<a.length;i++)
      {
      if(a[i]==nutr)
      {
        posicion=i;    
      }
     } 
     return posicion;
   }
   public static void main(String[] args)
   {
      //Declaración de variables
      Scanner sc=new Scanner(System.in);
      int num[]=new int[10];
      int posicion=-1;
      int nutr;
      int vmenor;
      int vmayor;

      System.out.println("Ingrese 10 elementos...");
       for(int i=0;i<num.length;i++)
      {
         System.out.print("\n Ingrese el valor # " +i+ ":");
         num[i]=sc.nextInt();    
      }
      System.out.println("Diguite el elemto a buscar: " );
      nutr=sc.nextInt();
      posicion=buscar(num, nutr);
      if(posicion>=0)
      {
        System.out.print("\nEl valor esta en la posición: " +posicion);
        System.out.println("\nel valor buscado fue: " + nutr);
      }
      else
      {
        System.out.println("No se localizo el elemento!!");
      }
      //Busqueda menor
      System.out.print("\n***El dato menor***");
      vmenor=menor(num);
      System.out.println("El dato menor es: " + vmenor);
      //Busqeuda mayor
      System.out.print("\n***El dato mayor***");
      vmayor=mayor(num);
      System.out.println("El dato mayor es: " + vmayor);
   }
}