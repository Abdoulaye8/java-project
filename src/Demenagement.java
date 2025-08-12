public class Demenagement {
    public static void main(String[] args) {
        int totalCartons = 34;
        int camionCapacity = 9;

        int reste = totalCartons;

        while (reste > 0) {
            int charge = Math.min(reste, camionCapacity);
            System.out.println("un voyage de" + " " + charge + " " + "cartons");
            reste -= charge;
        }
    }
}
