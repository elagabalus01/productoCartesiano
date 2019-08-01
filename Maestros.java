import java.util.*;
public class Maestros implements Iterable<String> {
    public final List<String> bList = new ArrayList<String>();
    @Override
    public Iterator<String> iterator() {
        return bList.iterator();
    }
    public static void main(String[] args) {
        Maestros maestros=new Maestros();
        maestros.bList.add("Hola");
        maestros.bList.add("Mundo");
        maestros.bList.add("Cruel");
        maestros.bList.add("Peter");
        maestros.bList.add("Griffin");
        for(String str:maestros)
        {
            System.out.println(str);
        }
    }
}