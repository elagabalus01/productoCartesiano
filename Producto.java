import java.util.*;
class Producto
{
    public static void multiArg(String[] ... args)
    {
        List<List<String>> result=new ArrayList<List<String>>();
        List<List<String>> aux;
        List<String> combinacion;
        result.add(new List<String>());
        for(String[] lista:args)
        {
            aux=new ArrayList<List<String>>();
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
        // for(ArrayList<String> crap:result)
        // {
        //     System.out.println(crap);
        // }
    }

    public static void main(String[] args)
    {
        String[] lista1={"a","b"};
        String[] lista2={"c","d"};
        String[] lista3={"e"};
        System.out.println("Hola mundo");
        // Producto.multiArg(lista1,lista2,lista3);
        Producto.multiArg(lista1,lista2);
    }
}