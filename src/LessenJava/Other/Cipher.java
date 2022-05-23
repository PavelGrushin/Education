package LessenJava.Other;

/**
 * Шифрует текст переводя в символы и обратно
 */
public class Cipher {
    public static void main(String[] args) {
        String msg = "Hello World";
        byte key = 100;
        char[] str = msg.toCharArray();
        for (int i = 0; i < msg.length(); i++) {
            str[i] ^= key;
        }
        msg = new String(str);
        System.out.println(msg);
        for (int i = 0; i < msg.length(); i++) {
            str[i] ^= key;
        }
        msg = new String(str);
        System.out.println(msg);

    }
}
