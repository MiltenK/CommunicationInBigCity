import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Введите кол-во станций");
        Scanner sc = new Scanner(System.in);
        int stationCount = Integer.parseInt(sc.nextLine());
        ArrayList<Stations> stationsArr = new ArrayList<>();
        System.out.println("Введите станции");

        for (int i = 0; i < stationCount; i++) {
            String stationName = sc.nextLine();
            String lineCoorAndR = sc.nextLine();
            String[] arrCoorAndR = lineCoorAndR.split(" ");
            int x = Integer.parseInt(arrCoorAndR[0]);
            int y = Integer.parseInt(arrCoorAndR[1]);
            int r = Integer.parseInt(arrCoorAndR[2]);
            Stations station = new Stations(stationName, x, y, r);
            stationsArr.add(station);
        }

        System.out.println("Введите ваши координаты");
        String lineOurCoor = sc.nextLine();
        String[] arrOurCoor = lineOurCoor.split(" ");
        int ourX = Integer.parseInt(arrOurCoor[0]);
        int ourY = Integer.parseInt(arrOurCoor[1]);

        for (int i = 0; i < stationsArr.size(); i++) {
            if (checkIfPos(ourX, ourY, stationsArr.get(i))){
                System.out.println(stationsArr.get(i));
            }
        }



    }

    public static boolean checkIfPos(int ourX, int ourY, Stations stations){
        int minix = stations.x - stations.r;
        int maxix = stations.x + stations.r;
        int miniy = stations.y + stations.r;
        int maxiy = stations.y + stations.r;

        ArrayList<Integer> listx = new ArrayList<>();
        for (int i = minix; i < maxix; i++) {
            listx.add(i);
        }

        boolean foundX = false;
        for (int num : listx) {
            if (num == ourX) {
                foundX = true;
                break;
            }
        }

        ArrayList<Integer> listy = new ArrayList<>();
        for (int i = miniy; i < maxiy; i++) {
            listy.add(i);
        }

        boolean foundy = false;
        for (int num : listx) {
            if (num == ourY) {
                foundy = true;
                break;
            }
        }

        if(foundX && foundy){
            return true;
        }
        else{ return false; }
    }
}
