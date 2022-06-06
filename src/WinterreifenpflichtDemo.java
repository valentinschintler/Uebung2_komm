public class WinterreifenpflichtDemo {

    public static void main(String[] args) {

        System.out.println(isWinterreifenpflichtText(isWinterreifenpflicht(3, true)));

    }

    public static String isWinterreifenpflichtText(boolean isWinterreifenpflicht) {
        if (isWinterreifenpflicht)
            return "Wintereifen verwenden";
        else
            return "Keine Winterreifen";

    }

    public static boolean isWinterreifenpflicht (int temp, boolean rutschig) {
        if (temp <10 && rutschig)
            return true;
        if (temp <4)
            return false;

        return true;
    }

}
