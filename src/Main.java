import java.util.*;

public class Main {
    static void main() {
        System.out.println("Введите кол-во станций");
        Scanner sc = new Scanner(System.in);
        int stationCount = Integer.parseInt(sc.nextLine());
        ArrayList<Station> stationsArr = getStations(stationCount, sc);

        Point result = getResult(sc);

        ArrayList<Station>  goodStations = new ArrayList<>();
        ArrayList<Station>  badStations = new ArrayList<>();
        for (int i = 0; i < stationsArr.size(); i++) {
            if (checkIfPos(result, stationsArr.get(i))){
                goodStations.add(stationsArr.get(i));
            }
            else { badStations.add((stationsArr.get(i))); }
        }


        Map<String, Integer> answer = new LinkedHashMap<>(); // благодаря этому у нас сортировка такая как надо
        for (Station st : goodStations){
            String name = st.name;
            if (!answer.containsKey(name)) {
                answer.put(name, 1);
            }
            else { answer.put(name, answer.get(name) + 1);
            }
        }

        for (Station st : badStations){
            if (!answer.containsKey(st.name)) {
                answer.put(st.name, 0);
            }
        }
        System.out.println(answer);


    }


    private static Point getResult(Scanner sc) {
        System.out.println("Введите ваши координаты");
        String lineOurCoor = sc.nextLine();
        String[] arrOurCoor = lineOurCoor.split(" ");
        int ourX = Integer.parseInt(arrOurCoor[0]);
        int ourY = Integer.parseInt(arrOurCoor[1]);
        Point result = new Point(ourX, ourY);
        return result;
    }





    private static ArrayList<Station> getStations(int stationCount, Scanner sc) {
        ArrayList<Station> stationsArr = new ArrayList<>();
        System.out.println("Введите станции");

        for (int i = 0; i < stationCount; i++) {
            String stationName = sc.nextLine();
            String lineCoorAndR = sc.nextLine();
            String[] arrCoorAndR = lineCoorAndR.split(" ");
            int x = Integer.parseInt(arrCoorAndR[0]);
            int y = Integer.parseInt(arrCoorAndR[1]);
            int r = Integer.parseInt(arrCoorAndR[2]);
            Station station = new Station(stationName, x, y, r);
            stationsArr.add(station);
        }
        return stationsArr;
    }

    public static boolean checkIfPos(Point p, Station stations){
        return stations.r >= stations.point.distanceTo(p);
    }

}
