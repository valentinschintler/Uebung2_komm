public class NotenDemo {

    public static void main(String[] args) {

        System.out.println(getNotentext(64));


    }

    public static String getNotentext(int punkte) {
        if (punkte >= 90)
            return "sehr gut";
        if (punkte <= 89 & punkte >= 78)
            return "gut";
        if (punkte <= 77 & punkte >= 65)
            return "befriedigend";
        if (punkte <= 64 & punkte >= 51)
            return "genügend";
        if (punkte <= 50)
            return "nicht genügend";

     return null;
    }


}
