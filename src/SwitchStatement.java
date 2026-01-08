public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus Dengan Baik King");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda tidak Lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        // switch lambda
        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus Dengan Baik King");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> System.out.println("Mungkin anda salah jurusan");
        }

        // switch yield
        // manual
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Anda Lulus Dengan Baik King";
            case "B", "C" -> ucapan = "Nilai anda cukup baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Mungkin anda salah jurusan";
        }
        System.out.println(ucapan);

        ucapan = switch (nilai) {
            case "A" : yield  "Anda Lulus Dengan Baik King";
            case "B", "C" : yield  "Nilai anda cukup baik";
            case "D" : yield  "Anda tidak lulus";
            default : yield  "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
