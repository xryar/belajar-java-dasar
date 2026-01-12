public class Scope {
    public static void main(String[] args) {
        sayHello("Ucup");
        sayHello("");
    }

    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            var hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}
