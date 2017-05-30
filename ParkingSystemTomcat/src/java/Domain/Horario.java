package Domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author Arelys Granados
 */
public class Horario {

    Map<Integer, String> treeMap = new TreeMap<Integer, String>();

    public Horario() {
    }

    public Map generaHorario() {

        treeMap.put(1, "LUNES       8am a 8pm");
        treeMap.put(2, "MARTES      8am a 8pm");
        treeMap.put(3, "MIERCOLES   8am a 8pm");
        treeMap.put(4, "JUEVES      8am a 8pm");
        treeMap.put(5, "VIERNES     8am a 8pm");
        treeMap.put(6, "SABADO      8am a 2pm");
        treeMap.put(7, "DOMINGO     8am a 12pm");

        return treeMap;
    }

    public String getHorario() {
        String result = null;
        // Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        System.out.println("      HORARIOsssss:   ");
        Iterator it = treeMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            result += (treeMap.get(key)) + "\n";
            
                System.out.println("      result:   "+result);
        }
        return result;
    }
}
