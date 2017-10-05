package main;

public class Main
{

    public static void main (String[] args)
    {
        Controlador controlador = new Controlador();
        InterfazABM interfaz= new InterfazABM(controlador);
        interfaz.setVisible(true);
        
    }
    
    /*1

int numero = 1234;
 
String cadena = "";
 
 
 
cadena = String.valueOf(numero);
 
cadena= Integer.toString(numero);
Pasar de String a int

Utilizamos el método parseInt de la clase Integer.

1
2
3
4
5
String cadena = "1234";
 
int numero = 0;
 
numero = Integer.parseInt(cadena)
Asimismo, la clase Float también posee un método parseFloat de igual características.*/

    //alternativa del like
        /*if (a != null)
        {
            List<DTOTipoImpuesto> dtoFiltroNombre = null;
            for(DTOTipoImpuesto dtotipo : dtoList)
            {
                String word = a;
                String text = dtotipo.getNombreDTOTipoImpuesto();
                Boolean found = findInString(word, text);
                if (found)
                {
                    dtoFiltroNombre.add(dtotipo);
                }
            }
            dtoList=dtoFiltroNombre;
        }
        */
    
}
