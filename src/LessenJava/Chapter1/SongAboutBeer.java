package LessenJava.Chapter1;

public class SongAboutBeer {
    public static void main(String[] args) {
        beerSong();
    }

    public static void beerSong() {
        int beerNum = 10;
        String word = "Бутылок";
        while (beerNum > 0) {

            System.out.println(beerNum + " " + word + " пива на стене...");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum--;
            if (beerNum == 1) {
                word = "Бутылка";
            }
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене!");
            } else {
                System.out.println("Нет бутылок пива на стене!");
            }
        }
    }
}
