package com.pavdem2012.textgame.switch_case_operator;

public class Main {

    public static void main(String[] args) {
        // В переменной типа integer хранится число 2 или 3 или 4.
        // Вывести сообщение"В переменной типа integer хранится "
        // и число прописью.
        Integer number = 3;
        SwitchCaseOperator switchCaseOperator = new SwitchCaseOperator();
        System.out.print(
                "В переменной типа Integer хранится число " + switchCaseOperator.detectNumber(number) + "." + "\n");

        // Дано название месяца прописью, вывести его порядковый номер.
        // Если в названии месяца есть ошибка, то вывести "Ошибка".
        // Регистр букв и наличие пробелов в начале или конце не должны влиять на работу
        // программы.
        String text3 = "  МаРт  ";
        System.out.println("\nПорядковый номер месяца: " + switchCaseOperator.detectNumberMonth(text3));

        // Переменная содержит код языка. МОгут быть три варианта: "en", "ru", "fr".
        // Вывести дни недели через запятую, на заданном языке, в зависимости от кода
        // языка.
        String text4 = "ru";
        System.out.println("\nНазвания дней недели: " + switchCaseOperator.outputNamesOfDays(text4));

        // По номеру месяца определить количество дней в месяце.
        Integer month = 2;
        System.out.print("\nВ месяце номер " + month + " дней: " + switchCaseOperator.detectCountOfDay(month) + ".");
    }
}
