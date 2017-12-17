package training.mocking.external;

public class StaticService {
    public static void doStatic() {
        System.out.println("UseStaticService doStatic");
    }

    public static String doStaticWithParams(final Object obj) {
        return "UseStaticService doStaticWithParams";
    }
}
