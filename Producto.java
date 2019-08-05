import java.util.*;
class Producto
{
    public static List<ArrayList<String>> productoCartesiano(String[] ... args)
    {
        List<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
        List<ArrayList<String>> aux;
        ArrayList<String> combinacion;
        result.add(new ArrayList<String>());
        for(String[] lista:args)
        {
            aux=new ArrayList<ArrayList<String>>();
            for(ArrayList<String> x:result)
            {
                for(String y:lista)
                {
                    combinacion=new ArrayList<String>();
                    for(String elemento:x)
                    {
                        combinacion.add(elemento);
                    }
                    combinacion.add(y);
                    aux.add(combinacion);
                }
                result=aux;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        String[] lista1={"a","b"};
        String[] lista2={"c","d"};
        String[] lista3={"e"};
        List<ArrayList<String>> resultado=Producto.productoCartesiano(lista1,lista2,lista3);
        for(ArrayList<String> crap:resultado)
        {
            System.out.println(crap);
        }
    }
}