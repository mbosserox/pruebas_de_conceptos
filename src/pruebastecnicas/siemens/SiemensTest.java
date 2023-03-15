package pruebastecnicas.siemens;

import org.junit.Test;

import javax.xml.transform.stream.StreamSource;


public class SiemensTest {



    @Test
    public void  givenValidInputReturnValidDoors(){
        String valid =validInput();
        System.out.println(valid);
       // System.out.println( Siemens.foundDoors(valid));
    }
    private  String validInput(){
        return  "##########\n" +
                "#***#****#\n" +
                "#***#****#\n" +
                "##*####*##\n" +
                "#********#\n" +
                "#********#\n" +
                "#**#######\n" +
                "#**#**#**#\n" +
                "#********#\n" +
                "##########";
    }
}