package com.pavdem2012.textgame.cycles_operator;

import java.util.Arrays;

public class CyclesOperators {
    /**
     * Дана переменная n. Вывести факториал n.
     * 
     * @param n int for proccesing
     * @return factorial of number n
     */
    public int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Даны две переменные: x, y. Вычислить x в степени y.
     * 
     * @param x int for proccesing
     * @param y int for proccesing
     * @return x to the power of y
     */
    public int degreeCalculator(int x, int y) {
        int j = 1;
        for (int i = 0; i < y; i = i + 1) {
            j *= x;
        }
        return j;
    }

    /**
     * Вывести массив типа boolean в обратном порядке используя цикл со счётчиком.
     * 
     * @param arrayForProcessing array for processing
     * @return boolean array in reverse order as string
     */
    public String reverseArray(boolean[] arrayForProcessing) {
        String processedText = "";
        for (int i = arrayForProcessing.length - 1; i >= 0; i--) {
            processedText += arrayForProcessing[i] + " ";
        }
        return processedText;
    }

    /**
     * Массив типа char выводить символы пока не встретится пробел.
     * 
     * @param inputText text for processing.
     * @return an array of characters up to the first space.
     */
    public String arrayToSpace(String inputText) {
        String outputText = "";
        char[] strToArray = inputText.toCharArray();
        for (int i = 0; strToArray[i] != ' '; i++) {
            outputText += strToArray[i];
        }
        return outputText;
    }

    /**
     * Альтернативное решение Массив типа char выводить символы пока не встретится
     * пробел.
     * 
     * @param inputText text for processing.
     * @return an array of characters up to the first space.
     */
    public String arrayToSpaceAlternative(String inputText) {
        String outputText = "";
        char[] strToArray = inputText.toCharArray();
        int i = 0;
        while (strToArray[i] != ' ') {
            outputText += strToArray[i];
            i++;
        }
        return outputText;
    }

    /**
     * По данному числу N вывести все целые степени двойки, не превосходящие N, в
     * порядке возрастания. Например: 1 2 4 8 16 32 для N=52
     * 
     * @param N int for processing
     * @return all integer powers of two not exceeding N
     */
    public String integerPowersOfTwo(int N) {
        String outputText = "";
        int x = 1;
        while (x < N) {
            outputText += x + ";" + " ";
            x *= 2;
        }
        return outputText;
    }

    /**
     * Дано натуральное число N. Выведите слово YES, если число N является точной
     * степенью двойки, или слово NO в противном случае.
     * 
     * @param N int for processing
     * @returnthe word YES if the number N is an exact power of two, or the word NO
     *            otherwise.
     */
    public String exactPowerOfTwo(int N) {
        String outputText = "";
        int x = 1;
        while (x < N) {
            x = x * 2;
        }
        if (x == N) {
            outputText = "YES";
        } else {
            outputText = "NO";
        }
        return outputText;
    }

    /**
     * Определите сумму всех элементов последовательности, завершающейся числом 0.
     * Массив {3,2,3,5,0,7,5,4}
     * 
     * @param numberArray array for processing
     * @return the sum of all elements of a zero-terminated sequence.
     */
    public int getMaxItemCount(int[] numberArray) {
        int sum = 0;
        for (int counter = 0; counter < numberArray.length; counter++) {
            if (numberArray[counter] == 0) {
                break;
            }
            sum = sum + numberArray[counter];
        }
        return sum;
    }

    /**
     * Последовательность состоит из натуральных чисел и завершается числом 0.
     * Определите, какое количество элементов этой последовательности, равны ее
     * наибольшему элементу. {3,5,1,5,2,3,5,0,7,5,4}
     * 
     * @param numberArray array for processing
     * @return the number of largest elements of the sequence to zero
     */
    public int numberOfLargestElementsSequence(int[] numberArray) {
        int max = 0;
        int numMax = 0;
        int number = -1;
        int counter = 0;
        while (number != 0) {
            number = numberArray[counter];
            counter++;
            if (number > max) {
                max = number;
                numMax = 1;
            } else if (number == max) {
                numMax += 1;
            }
        }
        return numMax;
    }

    /**
     * Вывести все элементы массива с четными индексами {3,5,1,5,2,3,5,0,7,5,4}
     * 
     * @param numberArray array for processing
     * @return all array elements with even indices
     */

    public String allElementsWithEvenIndex(int[] numberArray) {
        String processedText = "";
        int evenIndex = 0;
        for (int index = 0; index < numberArray.length; index++) {
            evenIndex = numberArray[index];
            if (index % 2 == 0) {
                processedText += evenIndex + ";" + " ";
            }
        }
        return processedText;
    }

    /**
     * Вывести все четные элементы массива {3,5,1,5,2,3,5,0,7,5,4}.
     * 
     * @param numberArray array for processing
     * @return all even elements of the array.
     */
    public String allEvenElements(int[] numberArray) {
        String processedText = "";
        int evenIndex = 0;
        for (int index = 0; index < numberArray.length; index++) {
            evenIndex = numberArray[index];
            if (evenIndex % 2 == 0) {
                processedText += evenIndex + ";" + " ";
            }
        }
        return processedText;
    }

    /**
     * Найти количество положительных элементов в данном массиве. {1,-2,3,-4,5}
     * 
     * @param numberArray array for processing
     * @return the number of positive elements in the given array
     */
    public int numberOfPositiveElementsInArray(int[] numberArray) {
        int counter = 0;
        int number = 0;
        for (int i = 0; i < numberArray.length; i++) {
            number = numberArray[i];
            if (number > 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Дан массив чисел. Выведите все элементы массива, которые больше предыдущего
     * элемента . {1,5,2,4,3}
     * 
     * @param numberArray array for processing
     * @return array elements that are larger than the previous one
     */
    public String elementsAreLargerPreviousOne(int[] numberArray) {
        String processedText = "";
        int number = 0;
        int previousNumber = 0;
        for (int i = 1; i < numberArray.length; i++) {
            number = numberArray[i];
            previousNumber = numberArray[i - 1];
            if (number > previousNumber) {
                processedText += number + "; ";
            }
        }
        return processedText;
    }

    /**
     * Дан массив целых чисел. Если в нем есть два соседних элемента одного знака,
     * выведите эти числа. Если соседних элементов одного знака нет - не выводите
     * ничего. Если таких пар соседей несколько - выведите первую пару.
     * {-1,2,3,-1,-2}
     * 
     * @param intList4 array for processing
     * @return two adjacent elements of the same sign
     */
    public String twoAdjacentElements(int[] numberArray) {
        String processedText = "";
        int previousNumber = 0;
        int number = 0;
        for (int i = 1; i < numberArray.length; i++) {
            previousNumber = numberArray[i - 1];
            number = numberArray[i];
            if (previousNumber > 0 & number > 0 | previousNumber < 0 & number < 0) {
                processedText = "\nСоседние элементы одного знака: " + previousNumber + "; " + number + "; \n";
                break;
            }
        }
        return processedText;
    }

    /**
     * Дан массив. { 3, 5, 1, 5, 2, 3, 5, 0, 7, 5, 4 } Создать новый массив и
     * наполнить его данным массивом, но в обратном порядке. Вывести новый массив на
     * экран.
     * 
     * @param numberArray array for processing
     * @return array in reverse order
     */
    public String arrayToNewReverseArray(int[] numberArray) {
        String processedText = "";
        int length = numberArray.length;
        int[] temporary = new int[length];
        for (int i = 0; i < length; i++) {
            temporary[i] = numberArray[length - i - 1];
            processedText += temporary[i] + "; ";
        }
        return processedText;
    }

    /**
     * Выведите значение наименьшего из всех положительных элементов в массиве.
     * Известно, что в массиве есть хотя бы один положительный элемент.
     * {5,-4,3,-2,1}
     * 
     * @param numberArray array for processing
     * @return smallest of all positive elements in the array
     */
    public String smallestOfPositiveElements(int[] numberArray) {
        String processedText = "";
        int min = numberArray[0];
        int number = 0;
        for (int i = 0; i < numberArray.length; i++) {
            number = numberArray[i];
            if (number > 0 & numberArray[i] < min) {
                min = number;
                processedText = "\nНаименьший из положительных элементов: " + min + ";\n";
            }
        }
        return processedText;
    }

    /**
     * Выведите значение наименьшего нечетного элемента списка, а если в списке нет
     * нечетных элементов - выведите число 0 {0,1,2,3,4} -> 1 {2,4,6,8,10} -> 0
     * 
     * @param numberArray array for processing
     * @return the value of the smallest odd element of the list
     */
    public int smallestOddElementList(int[] numberArray) {
        int smallestOddElementList = 0;
        int n = numberArray.length;
        int min = numberArray[n - 1];
        int number = 0;
        for (int i = 0; i < numberArray.length; i++) {
            number = numberArray[i];
            if (number != 0 & number % 2 != 0 & numberArray[i] < min) {
                min = number;
                smallestOddElementList = min;
                break;
            } else {
                smallestOddElementList = 0;
            }
        }
        return smallestOddElementList;
    }

    /**
     * Дан список, упорядоченный по возрастанию элементов в нем. Определите, сколько
     * в нем различных элементов. {1,2,2,3,3,3} -> 3
     * 
     * @param numberArray array for processing
     * @return number of different elements
     */
    public int numberOfDifferentElements(int[] numberArray) {
        int numberOfDifferentElements = 1;
        int number = 0;
        int previousNumber = 0;
        if (numberArray.length == 0) {
            numberOfDifferentElements = 0;
            return numberOfDifferentElements;
        }
        for (int i = 1; i < numberArray.length; i++) {
            number = numberArray[i];
            previousNumber = numberArray[i - 1];
            if (number > previousNumber) {
                numberOfDifferentElements++;
            }
        }
        return numberOfDifferentElements;
    }

    /**
     * Переставьте соседние элементы массива (A[0] c A[1], A[2] c A[3] и т.д.). Если
     * элементов нечетное число, то последний элемент остается на своем месте.
     * {1,-2,3,-4,5}, {1,-2,3,-4,5,7}
     * 
     * @param numberArray array for processing
     * @return Rearrange adjacent array elements
     */
    public String rearrangeAdjacentArrayElements(int[] numberArray) {
        String processedText = "";
        for (int i = 1; i < numberArray.length; i += 2) {
            int cache = numberArray[i];
            numberArray[i] = numberArray[i - 1];
            numberArray[i - 1] = cache;
        }
        for (int i = 0; i < numberArray.length; i++) {
            processedText += numberArray[i] + "; ";
        }
        return processedText;
    }

    // Циклически сдвиньте элементы списка вправо (A[0] переходит на место A[1],
    // A[1] на место A[2], последний элемент переходит на место A[0]).
    // {1,-2,3,-4,5}
    public String cyclicalRightShift(int[] numberArray) {
        String processedText = "";
        int n = 1;
        int[] newArray = new int[numberArray.length];
        for (int i = numberArray.length-1; i >= 0; i--) {
            if(i+n >= numberArray.length){
                newArray[i+n-numberArray.length] = numberArray[i];
            }
            else{
                newArray[i+n] = numberArray[i];
            }
        }
        for (int i : newArray) {
            //System.out.println(i);
            processedText += i + "; ";
        }
        return processedText;
    }

    /**
     * Дан массив чисел. Посчитайте, сколько в нем пар элементов, равных друг другу.
     * Считается, что любые два элемента, равные друг другу образуют одну пару,
     * которую необходимо посчитать. {1,2,3,2,3} -> 2
     * 
     * @param numberArray array for processing
     * @return the number of pairs of elements equal to each other
     */
    public int pairsElementsEqualToEachOther(int[] numberArray) {
        Arrays.sort(numberArray);
        int countOfPairs = 0;
        int number = 0;
        int previousNumber = 0;
        if (numberArray.length < 2) {
            countOfPairs = 0;
            return countOfPairs;
        }
        for (int i = 1; i < numberArray.length; i++) {
            number = numberArray[i];
            previousNumber = numberArray[i - 1];
            if (number == previousNumber) {
                countOfPairs++;
            }
        }
        return countOfPairs;
    }

    /**
     * Дан массив. Выведите те его элементы, которые встречаются в массиве только
     * один раз. Элементы нужно выводить в том порядке, в котором они встречаются в
     * списке. {4,3,5,2,5,1,3,5} -> 4 2 1
     * 
     * @param numberArray numberArray array for processing
     * @return array elements that occur only once, in the order they appear in the
     *         list
     */
    public String uniqueArrayElements(int[] numberArray) {
        String uniqueArrayElements = "";
        for (int i = 0; i < numberArray.length; i++) {
            int count = 0;
            for (int j = 0; j < numberArray.length; j++)
                if (numberArray[i] == numberArray[j])
                    count++;
            if (count == 1)
                uniqueArrayElements += numberArray[i] + "; ";
        }
        return uniqueArrayElements;
    }
}
