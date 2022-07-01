package org.example.ManagerAfisha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void addMovie1() {                       // Добавление 1 нового фильма
        FilmsManager manager = new FilmsManager();
        manager.addMovie("Первый");

        String[] expected = {"Первый"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addMovie3() {                        // Добавление 3-х новых фильмов
        FilmsManager manager = new FilmsManager();
        manager.addMovie("Первый");
        manager.addMovie("Второй");
        manager.addMovie("Третий");

        String[] expected = {"Первый", "Второй", "Третий"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie0() {                       // Без добавления фильмов
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastLimit10() {                       // Вывод последних добавленных 10 фильмов (лимит по умолчанию)
        FilmsManager manager = new FilmsManager();
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");
        manager.addMovie("7");
        manager.addMovie("8");
        manager.addMovie("9");
        manager.addMovie("10");
        manager.addMovie("11");

        String[] expected = {"11", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast10Limit10() {                       // Вывод последних добавленных 10 фильмов (лимит по умолчанию) при количестве 10 добавленных фильмов
        FilmsManager manager = new FilmsManager();
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");
        manager.addMovie("7");
        manager.addMovie("8");
        manager.addMovie("9");
        manager.addMovie("10");

        String[] expected = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit5() {                       // Вывод последних добавленных 5 фильмов (лимит - 5)
        FilmsManager manager = new FilmsManager(5);
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");

        String[] expected = {"6", "5", "4", "3", "2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast5Limit5() {                       // Вывод последних добавленных 5 фильмов (лимит - 5) при количестве 5 добавленных фильмов
        FilmsManager manager = new FilmsManager(5);
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");

        String[] expected = {"5", "4", "3", "2", "1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit15() {                       // Вывод последних добавленных 15 фильмов (лимит - 15)
        FilmsManager manager = new FilmsManager(15);
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");
        manager.addMovie("7");
        manager.addMovie("8");
        manager.addMovie("9");
        manager.addMovie("10");
        manager.addMovie("11");
        manager.addMovie("12");
        manager.addMovie("13");
        manager.addMovie("14");
        manager.addMovie("15");
        manager.addMovie("16");

        String[] expected = {"16", "15", "14", "13", "12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast15Limit15() {                       // Вывод последних добавленных 15 фильмов (лимит - 15) при количестве добавленных 15 фильмов
        FilmsManager manager = new FilmsManager(15);
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");
        manager.addMovie("7");
        manager.addMovie("8");
        manager.addMovie("9");
        manager.addMovie("10");
        manager.addMovie("11");
        manager.addMovie("12");
        manager.addMovie("13");
        manager.addMovie("14");
        manager.addMovie("15");
        manager.addMovie("16");

        String[] expected = {"16", "15", "14", "13", "12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}



