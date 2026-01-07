public class Array {
    public static void main(String[] args) {
        String[] stringArray = new String[3];

        stringArray[0] = "Arya";
        stringArray[1] = "Rizki";
        stringArray[2] = "Andaru";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Ucogs";
        System.out.println(stringArray[0]);

        // alternative declaration array
        String[] namaNama = {
             "Arya", "Rizki", "Andaru"
        };

        namaNama[0] = null;

        long[] arrayLong = {
            10L, 20L, 30L, 40L, 50L
        };

        arrayLong[0] = 0;
        System.out.println(arrayLong.length);

        // array in array
        String[][] members = {
                {"Arya", "Rizki"},
                {"Reza", "Rahmatullah"},
                {"Ucogs", "Nugraha"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
