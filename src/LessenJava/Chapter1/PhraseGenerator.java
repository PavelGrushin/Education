package LessenJava.Chapter1;

public class PhraseGenerator {
    public static void main(String[] args) {
        generator();
    }

    public static void generator() {
        String[] wordListOne = {"круглосуточный", "трёх-звенный",
                "30000 - футовый", "взаимный", "обоюдный выигрыш",
                "фронтенд", "на основе веб - технологий", "проникающий",
                "умный", "шесть сигм", "метод кретического пути", "динамичный"};
        String[] wordListTwo = {"уполнаочнный", "трудный",
                "чистый продукт", "ориентированный", "центральный",
                "распределительнный", "кластеризованный", "фирменный",
                "нестандартный ум", "позиционированный", "сетевой",
                "сфокусированный", "использованный с выгодой",
                "выровненный", "нацеленный на", "общий", "совместный",
                "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки",
                "выход из положения", "тип структуры", "талант",
                "подход", "уровень заваоеанного внимания", "портал",
                "периуд времени", "обзор", "образец", "пункт следования"};
        int oneLeng = wordListOne.length;
        int twoLeng = wordListTwo.length;
        int threeLeng = wordListThree.length;

        int oneRand = (int) (Math.random() * oneLeng);
        int twoRand = (int) (Math.random() * twoLeng);
        int threeRand = (int) (Math.random() * threeLeng);

String phrase = wordListOne[oneRand] + " " + wordListTwo[twoRand] + " " + wordListThree[threeRand];
        System.out.println("Всё, что нам нужно, - это " + phrase);
    }
}
