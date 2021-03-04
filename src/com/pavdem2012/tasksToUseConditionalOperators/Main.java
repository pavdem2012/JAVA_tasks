package com.pavdem2012.tasksToUseConditionalOperators;
public class Main {
    public static void main(String[] args) {
        //В переменной integer хранится число 2 или 3 или 4. Вывести сообщение 
        //"В переменной integer хранится " и число прописью.
        Integer number = 0;
        ConditionalOperator conditionalOperator = new ConditionalOperator();
        System.out.print("В переменной Integer хранится число " + conditionalOperator.detectNumber(number));
    }
}
