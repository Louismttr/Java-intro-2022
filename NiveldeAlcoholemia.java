import java.util.Scanner;
public class NiveldeAlcoholemia
{
 public static void main(String args [])
 {
 
    //Declaracion de Variables
   int indicador, nivelAl;
  Scanner entrada=new Scanner(System.in);

  System.out.println("Ingrese el tipo de vehiculo, segun el indicador");
  indicador=entrada.nextInt();
  System.out.println("Ingrese el tipo nivel de alcohol del conductor");
  nivelAl=entrada.nextInt();

  switch(indicador)
  {
   case 1:
   if(nivelAl>0.4)
    {
   System.out.println("El nivel de alcoholemia es positivo");
   }
   else 
   {
    System.out.println("El nivel de alcoholemia es negativo");
   }
   break;

   case 2:
   if(nivelAl>0.3)
   {
   System.out.println("El nivel de alcoholemia es positivo");
   }
   else 
   {
    System.out.println("El nivel de alcoholemia es negativo");
   }
    break;
    case 3:
    if(nivelAl>0.5)
    {
    System.out.println("El nivel de alcoholemia es positivo");
   }
   else 
   {
     System.out.println("El nivel de alcoholemia es negativo");
   }
   break;

   case 4:
    if(nivelAl>0.6)
    {
    System.out.println("El nivel de alcoholemia es positivo");
   }
    else 
    {
     System.out.println("El nivel de alcoholemia es negativo");
    }
    break;

    default:
    System.out.println("Error al ingresar el indicador");
  }
 }
}