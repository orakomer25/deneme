package day33_encapsulation_inheritance;

public class C03_GenelMudur {
    public static void main(String[] args) {
    C01_pazarlama pazarlama = new C01_pazarlama();
        System.out.println(pazarlama.getToplamSatis());
        pazarlama.setSatis(400);
        pazarlama.setSatis(200);
        pazarlama.setSatis(100);
        System.out.println(pazarlama.getToplamSatis());
    }
}
