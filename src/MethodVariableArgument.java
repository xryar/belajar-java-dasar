public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 70, 60, 60};
        sayCongrats("Ucup", values);

        sayCongrats("Ucogs", 80, 60, 60, 70);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value: values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Mohon Maaf " + name + ", Anda Tidak Lulus");
        }

    }
}
