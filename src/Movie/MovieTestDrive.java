package Movie;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;

        Movie three = new Movie();
        three.title = "Байт-клуб";
        three.genre = "Скорее камедия чем драмма";
        three.rating = 4;

    }
}
