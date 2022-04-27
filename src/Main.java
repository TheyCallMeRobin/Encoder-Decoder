import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Encoder e = new Encoder();
        int[] a = e.encode("Secret message", 10);
        System.out.println(Arrays.toString(a));  //93

        Decoder d = new Decoder();
        String decodedMsg = d.decode(a, 12387234);
        System.out.println(decodedMsg); //s
    }
}