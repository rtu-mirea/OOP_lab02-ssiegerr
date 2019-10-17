package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int test = 8;
        Scanner in = new Scanner(System.in);
        while (test != 0) {
            try {
                System.out.print("[0] - Завершение работы" + '\n' +
                        "[1] - Вариант на String" + '\n' +
                        "[2] - Ванриант на StringBuffer" + '\n' +
                        "[3] - Вариант на регулярные выражения" + '\n' +
                        "Выберите вариант: ");
                test = in.nextInt();
                switch (test) {
                    case 0:
                        System.out.print("End of working");
                        break;
                    case 1:
                        testStringClass(in);
                        break;
                    case 2:
                        testStringBuilderClass(in);
                        break;
                    case 3:
                        testRegularExpressionsClass(in);
                        break;
                    default:
                        System.out.println("Вы ввели недопустимую конструкцию!");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    static void testStringClass(Scanner in) throws Exception {
        StringWork object = new StringWork();
        int task = 8;
        String str;
        while (task != 0){
            System.out.print("[0] - Предыдущее меню" + '\n' +
                    "[1] - Ввод строки" + '\n' +
                    "[2] - Вывод строки" + '\n' +
                    "[3] - Преобразовать все слова к одному формату: либо строчные буквы,\n" +
                    "либо прописные" + '\n' +
                    "[4] - Сформировать массив из слов" + '\n' +
                    "[5] - Сформировать массив вхождений каждого найденного слова в текст" + '\n' +
                    "[6] - Определить, сколько слов начинаются с заданного префикса" + '\n' +
                    "Выберете задание: ");
            task = in.nextInt();
            switch(task){
                case 0:
                    System.out.println("Возвращение к предыдущему меню...");
                    break;
                case 1:
                    System.out.println("Введите текст: ");
                    in.nextLine();
                    str = in.nextLine();
                    object.setText(str);
                    break;
                case 2:
                    System.out.println(object.getText());
                    break;
                case 3:
                    object.allTo(in);
                    System.out.println("Итоговая строка:\n" +object.getText());
                    break;
                case 4:
                    String sArr[] = object.getArr();
                    System.out.println("Массив строк:\n" + Arrays.toString(sArr));
                    break;
                case 5:
                    int iArr[] = object.getArrInd();
                    System.out.println("Массив индексов вхождений слов:\n" + Arrays.toString(iArr));
                    break;
                case 6:
                    System.out.println("Введите префикс:");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println(object.wordCount(str).toString() + " слов начинается с префикса \"" + str + "\"");
                    break;
                default:
                    System.out.println("Вы ввели недопустимую конструкцию!");
                    break;
            }
        }
    }
    static void testStringBuilderClass(Scanner in) {
        StringBuilderWork object = new StringBuilderWork();
        int task = 8;
        while (task != 0){
            System.out.print("[0] - Предыдущее меню" + '\n' +
                    "[1] - Ввод строки" + '\n' +
                    "[2] - Вывод строки" + '\n' +
                    "[3] - Найти в тексте двузначные числа и заменить их строкой из\n" +
                    "символов + длиной равной двузначному числу" + '\n' +
                    "[4] - Добавить в самое короткое предложение текста одно слово\n" +
                    "КОНЕЦ" + '\n' +
                    "[5] - Найти трехзначные числа и заменить из обратными числами,\n" +
                    "т.е.число 123 заменить на 321" + '\n' +
                    "Выберете задание: ");
            task = in.nextInt();
            switch(task){
                case 0:
                    System.out.println("Возвращение к предыдущему меню...");
                    break;
                case 1:
                    System.out.println("Введите текст: ");
                    in.nextLine();
                    String str = in.nextLine();
                    object.setText(new StringBuilder(str));
                    break;
                case 2:
                    System.out.println(object.getText());
                    break;
                case 3:
                    object.setPlus();
                    System.out.println("Строка с замененными числами:\n" + object.getText());
                    break;
                case 4:
                    object.addKONEC();
                    System.out.println("Строка с добавленым концом:\n" + object.getText());
                    break;
                case 5:
                    object.changeNum();
                    System.out.println("Строка с изсменнеными числами:\n" + object.getText());
                    break;
                default:
                    System.out.println("Вы ввели недопустимую конструкцию!");
                    break;
            }
        }
    }
    static void testRegularExpressionsClass(Scanner in) {
        RegularExpression object = new RegularExpression();
        int task = 8;
        while (task != 0){
            System.out.print("[0] - Предыдущее меню" + '\n' +
                    "[1] - Ввод строки" + '\n' +
                    "[2] - Вывод строки" + '\n' +
                    "[3] - Дан текст. Сформировать список всех электронных адресов,\n" +
                    "содержащихся в этом тексте." + '\n' +
                    "Выберете задание: ");
            task = in.nextInt();
            switch (task){
                case 0:
                    System.out.println("Возвращение к предыдущему меню...");
                    break;
                case 1:
                    System.out.println("Введите текст: ");
                    in.nextLine();
                    String str = in.nextLine();
                    object.setText(str);
                    break;
                case 2:
                    System.out.println("Ваш текст:\n" + object.getText());
                    break;
                case 3:

                    System.out.println("Список Email\'ов:\n" + object.findEmail());
                    break;
                default:
                    System.out.println("Вы ввели недопустимую конструкцию!");
                    break;
            }
        }
    }
}
