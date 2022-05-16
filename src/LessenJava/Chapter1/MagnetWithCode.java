package LessenJava.Chapter1;

public class MagnetWithCode {

    static DrumKitTestDrive d = new DrumKitTestDrive();

    public static void main(String[] args) {
        d.playSnare();
        d.playTopHat();
    }
}

class DrumKitTestDrive {
    void playSnare() {
        System.out.println("Bah, Bah");
    }

    void playTopHat() {
        System.out.println("Din, Din");
    }
}