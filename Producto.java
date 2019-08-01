import java.util.*;
class Producto
{
    public static void multiArg(Maestros ... args)
    {
        List<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
        List<ArrayList<String>> aux;
        ArrayList<String> combinacion;
        result.add(new ArrayList<String>());
        for(Maestros lista:args)
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
        for(ArrayList<String> crap:result)
        {
            System.out.println(crap);
        }
    }

    public static void main(String[] args)
    {
        // String[] lista1={"a","b"};
        // String[] lista2={"c","d"};
        // String[] lista3={"e"};
        Maestros lista1=new Maestros();
        lista1.bList.add("a");
        lista1.bList.add("b");
        
        Maestros lista2=new Maestros();
        lista2.bList.add("c");
        lista2.bList.add("d");

        Maestros lista3=new Maestros();
        lista3.bList.add("e");

        Producto.multiArg(lista1,lista2,lista3);
    }
}