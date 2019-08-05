import java.util.*;
class Producto
{
    public static <E> List<ArrayList<E>> productoCartesiano(E[] ... args)
    {
        List<ArrayList<E>> result=new ArrayList<ArrayList<E>>();
        List<ArrayList<E>> aux;
        ArrayList<E> combinacion;
        result.add(new ArrayList<E>());
        for(E[] lista:args)
        {
            aux=new ArrayList<ArrayList<E>>();
            for(ArrayList<E> x:result)
            {
                for(E y:lista)
                {
                    combinacion=new ArrayList<E>();
                    for(E elemento:x)
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