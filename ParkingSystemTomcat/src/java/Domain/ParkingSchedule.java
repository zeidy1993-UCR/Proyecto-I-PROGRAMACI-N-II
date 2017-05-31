package logica;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


/**
 *
 * @author Arelys Granados
 */
public class ParkingSchedule {

    Map<Integer, String> treeMap = new TreeMap<Integer, String>();

    public ParkingSchedule() {
    }

    public Map generateSchedule() {

        treeMap.put(1, "______________________________________________________LUNES:___________8am......8pm__________________________________________________________");
        treeMap.put(2, "______________________________________________________MARTES:_________8am......8pm__________________________________________________________");
        treeMap.put(3, "______________________________________________________MIERCOLES:______8am......8pm________________________________________________________");
        treeMap.put(4, "______________________________________________________JUEVES:__________8am......8pm__________________________________________________________");
        treeMap.put(5, "______________________________________________________VIERNES:_________8am......8pm__________________________________________________________");
        treeMap.put(6, "______________________________________________________SABADO:_________8am......2pm__________________________________________________________");
        treeMap.put(7, "______________________________________________________DOMINGO:________8am......12pm________________________________________________________");

        return treeMap;
    }

    public String getSchedule() {
        String result = "";
        // Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        Iterator it = generateSchedule().keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            result += "\n" + (treeMap.get(key)) + "\n";
        }
        return result;
    }

}
