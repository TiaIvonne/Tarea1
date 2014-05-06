
/**
 * Write a description of class Nota here.
 * ñac
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nota
{
    public static void main(String[]args)
    {
        System.out.print("Ingrese nota");
        double nota = Leer.datoDouble();
        
        if (nota == 10)
        System.out.println("Matricula de honor");
        else if (nota >= 9)
        System.out.println("Sobresaliente");
        else if (nota >= 7)
        System.out.println("Notable");
        else if (nota >=5)
        System.out.println("Aprobado");
        else 
        System.out.println("Suspenso");

    
}
}
