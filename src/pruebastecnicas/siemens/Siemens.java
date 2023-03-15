package pruebastecnicas.siemens;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;

public class Siemens {
    static final Character WALL = '#';
    static final Character FREE_SPACE = '*';
    static final Character DOOR = 'D';
    static HashMap<String,Color> colors ;

    public static void main(String[] args) {

        setColors();
        String plan = getPlan();
        plan = generatePaintedPlan(plan);
        printPlan(plan);

    }
    public static void printPlan(String plan){
        String[] lines = plan.split("\n");
        for ( String line: lines) {
            for (int i = 0; i < line.length()-1; i++) {
                if(line.charAt(i)==WALL || line.charAt(i)==DOOR ){
                    System.out.print(line.charAt(i));
                }else{
                    System.out.print(colors.get(String.valueOf(line.charAt(i))));
                    System.out.print(" ");
                    System.out.print(Color.RESET);
                }

            }
            System.out.println("");
        }
    }
    private static void setColors(){
        colors = new HashMap<>();
        colors.put("1",Color.BLACK_BACKGROUND);
        colors.put("2",Color.WHITE_BACKGROUND);
        colors.put("3",Color.RED_BACKGROUND);
        colors.put("4",Color.MAGENTA_BACKGROUND);
        colors.put("5",Color.YELLOW_BACKGROUND);
        colors.put("6",Color.GREEN_BACKGROUND);
        colors.put("7",Color.CYAN_BACKGROUND);
        // High Intensity backgrounds

    }
    private static String getPlan() {
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

    public static String  generatePaintedPlan(String plan){
        String[] lines = plan.split("\n");
        StringBuilder  result =new StringBuilder();
        result.append(lines[0]+"\n");
        int countRoom=1;
        String lineUp = lines[0];
        for (int i = 1; i < lines.length-1; i++) {
            StringBuilder  line =new StringBuilder(lines[i]);

            String lineDown = lines[i+1];
            for (int j = 1; j < line.length()-1 ; j++) {
                char possPrev = line.charAt(j-1);
                char possNext = line.charAt(j+1);
                char poss = line.charAt(j);
                char possUp = lineUp.charAt(j);
                char possDown = lineDown.charAt(j);

                if(poss==FREE_SPACE){

                    //first of the neighborhood
                    if(possPrev==WALL && possUp==WALL){
                        line=line.replace(j,j+1,String.valueOf(countRoom++));
                    }
                    //get copy from  neighborhood
                    if((possPrev==WALL || possPrev==DOOR) && (possUp!=WALL)){
                        line=line.replace(j,j+1,String.valueOf(possUp));
                    }
                    //middle del medio
                    if(possPrev!=WALL  && possPrev!=DOOR){
                        line=line.replace(j,j+1,String.valueOf(possPrev));
                    }
                    //find door
                    if((possDown==WALL && possUp==WALL) || (possPrev==WALL && possNext==WALL)){
                        line=line.replace(j,j+1,"D");
                    }
                }
                //
            }
            lineUp = line.toString();
            result.append(line+"\n");
        }
        result.append(lines[lines.length-1]);
        return result.toString();
    }

}
