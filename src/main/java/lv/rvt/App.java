package lv.rvt; 
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*;
import javax.sound.midi.Soundbank;
import lv.rvt.connecticut.Box; 
 
public class App { 
    public static void main ( String[] args )
    {
        Box box = new  Box( 2.5, 5.0, 6.0 ) ;
        Box box1 = new Box(box);

        System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );
        System.out.println("topArea: " + box.getTopArea());
        System.out.println(box1);
        Box box2 = new Box(7);
        System.out.println(box2.nests(box1));
        Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(engine.getEngineType());
        System.out.println(engine.getManufacturer());
    }
}