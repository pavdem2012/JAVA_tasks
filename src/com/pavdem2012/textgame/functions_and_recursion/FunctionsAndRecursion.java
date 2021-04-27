package com.pavdem2012.textgame.functions_and_recursion;

import java.util.Scanner;

public class FunctionsAndRecursion {
    Scanner in = new Scanner(System.in);

    /**
     * Напишите функцию min(a, b), вычисляющую минимум двух чисел.
     * 
     * @param a any entered number.
     * @param b any entered number.
     * @return minimum of any two entered numbers.
     */
    public int getMin(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    /**
     * напишите функцию min4(a, b, c, d), вычисляющую минимум 4 чисел с помощью
     * функции min. Считайте четыре целых числа и выведите их минимум.
     * 
     * @param a any entered integer.
     * @param b any entered integer.
     * @param c any entered integer.
     * @param d any entered integer.
     * @return minimum of any four entered numbers.
     */
    public int getMin(int a, int b, int c, int d) {
        return getMin(getMin(a, b), getMin(c, d));
    }

    /**
     * Даны четыре действительных числа: x1, y1, x2, y2. Напишите функцию
     * distance(x1, y1, x2, y2), вычисляющую расстояние между точкой (x1. y1) и (x2,
     * y2). Считайте четыре действительных числа и выведите результат работы этой
     * функции.
     * 
     * @param x1 any valid number entered.
     * @param x2 any valid number entered.
     * @param y1 any valid number entered.
     * @param y2 any valid number entered.
     * @return distance between point (x1. y1) and (x2, y2).
     */
    public double getDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    /**
     * "Дано действительное положительное число f и целоe число n. Вычислите f в
     * степени n. Решение оформите в виде рекурсивной функции power(f, n)."
     * 
     * @param f any valid number entered.
     * @param n any entered integer.
     * @return f to power n.
     * @throws Exception critical exponentiation error.
     */
    public double power(double f, int n) throws Exception {
        if (f == 0 & n == 0) {
            throw new Exception("Ноль в нулевой степени неопределён и лишён смысла!!!");
        }
        if (n < 0) {
            throw new Exception("Cтепень должна быть >= 0!!!");
        }
        if (n == 0) {
            return 1;
        }
        return f * power(f, n - 1);
    }

    /**
     * "Дано натуральное число e > 1. Выведите его наименьший делитель, отличный от
     * 1. Решение оформите в виде функции MinDivisor(e). Количество операций в
     * программе должно быть пропорционально корню из e. Указание. Если у числа e
     * нет делителя, меньшего e , то число e — простое и ответом будет само число
     * e."
     * 
     * @param e any natural number >1.
     * @return least divisor of a natural number e.
     */
    public int minDivisor(int e) {
        if (e % 2 == 0)
            return 2;
        for (int i = 3; i * i <= e; i += 2) {
            if (e % i == 0)
                return i;
        }
        return e;
    }

    /**
     * Решение через рекурсивную функцию: "Дано натуральное число e > 1. Выведите
     * его наименьший делитель, отличный от 1. Решение оформите в виде функции
     * MinDivisor(e). Количество операций в программе должно быть пропорционально
     * корню из e. Указание. Если у числа e нет делителя, меньшего e , то число e —
     * простое и ответом будет само число e."
     * 
     * @param e any natural number >1.
     * @param d is optional and has a default value of 2.
     * @return least divisor of a natural number e.
     */
    public int minDivisor(int e, int d) {
        if (e % d == 0)
            return d;
        return minDivisor(e, ++d);
    }

    /**
     * "Дано натуральное число n > 1. Проверьте, является ли оно простым. Программа
     * должна вывести слово YES, если число простое и NO, если число составное.
     * Решение оформите в виде функции IsPrime(n), которая возвращает True для
     * простых чисел и False для составных чисел. Количество операций в программе
     * должно быть пропорционально корню из n."
     * 
     * @param g any natural number >1.
     * @param i is optional and has a default value
     * @return true or false.
     */
    public boolean isPrime(int g, int i) {
        if (g == 2) {
            return true;
        }
        if (g % i == 0) {
            return false;
        }
        if (i <= Math.sqrt(g)) {
            return isPrime(g, i + 1);
        }
        return true;
    }

    /**
     * Альтернативное решение: "Дано натуральное число n > 1. Проверьте, является ли
     * оно простым. Программа должна вывести слово YES, если число простое и NO,
     * если число составное. Решение оформите в виде функции IsPrime(n), которая
     * возвращает True для простых чисел и False для составных чисел. Количество
     * операций в программе должно быть пропорционально корню из n."
     * 
     * @param g any natural number >1.
     * @param i is optional and has a default value
     * @return true or false.
     */
    public boolean isPrime1(int g, int i) {
        if (g < 2) {
            return false;
        } else if (g == 2) {
            return true;
        } else if (g % i == 0) {
            return false;
        } else if (i < g / 2) {
            return isPrime1(g, i + 1);
        } else {
            return true;
        }
    }

    /**
     * Еще одно альтернативное решение(Забавная математическая шутка и код намного
     * короче): "Дано натуральное число n > 1. Проверьте, является ли оно простым.
     * Программа должна вывести слово YES, если число простое и NO, если число
     * составное. Решение оформите в виде функции IsPrime(n), которая возвращает
     * True для простых чисел и False для составных чисел. Количество операций в
     * программе должно быть пропорционально корню из n."
     * 
     * @param g any natural number >1.
     * @return "YES" or "NO"
     */
    public String isPrime(int g) {
        if (g == 2 | g == 3) {
            return "YES";
        }
        if ((g * g) % 24 == 1) {
            return "YES";
        }
        return "NO";
    }

    /**
     * "Напишите функцию fib(n), которая по данному целому положительному n
     * возвращает n-e число Фибоначчи. В этой задаче нельзя использовать циклы -
     * используйте рекурсию. Первое и второе числа Фибоначчи равны 1, а каждое
     * следующее равно сумме двух предыдущих."
     * 
     * @param h any integer.
     * @return n-th Fibonacci number.
     */
    public int fib(int h) {
        if (h == 1 | h == 2) {
            return 1;
        } else {
            return fib(h - 1) + fib(h - 2);
        }
    }

    /**
     * Дана последовательность чисел, завершающаяся числом 0. Найдите сумму всех
     * этих чисел, не используя цикл.
     * 
     * @param sum sum of numbers.
     */
    public void recursionSum(int sum) {
        int n = in.nextInt();
        if (n > 0) {
            recursionSum(sum + n);
        } else if (sum > 0) {
            System.out.println("Сумма последовательности равна: " + (int) sum + ";");
        }
    }

    /**
     * Дано натуральное число n. Выведите все числа от 1 до n.
     * 
     * @param i any integer.
     * @return all numbers from 1 to n.
     */
    public String recursiveOutputNumbers(int i) {
        if (i == 1) {
            return "1";
        }
        return recursiveOutputNumbers(i - 1) + "; " + i;
    }

    /**
     * Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от
     * A до B включительно, в порядке возрастания, если A < B, или в порядке
     * убывания в противном случае.
     * 
     * @param a1 any integer.
     * @param b1 any integer.
     * @return all numbers from A to B inclusive, in ascending order if A <B, or in
     *         descending order otherwise.
     */
    public String outputNumbers(int a1, int b1) {
        if (a1 == b1) {
            return Integer.toString(a1);
        }
        if (a1 > b1) {
            return a1 + "; " + outputNumbers(a1 - 1, b1);
        }
        return a1 + "; " + outputNumbers(a1 + 1, b1);
    }

    /**
     * "Дано натуральное число N. Выведите слово YES, если число N является точной
     * степенью двойки, или слово NO в противном случае. Операцией возведения в
     * степень пользоваться нельзя!"
     * 
     * @param c1 any valid number entered.
     * @return result of exactPowerOfTwo method
     */
    public int exactPowerOfTwo(double c1) {
        if (c1 == 1) {
            return 1;
        } else if (c1 > 1 && c1 < 2) {
            return 0;
        } else {
            return exactPowerOfTwo(c1 / 2);
        }
    }

    /**
     * Дана последовательность натуральных чисел (одно число в строке),
     * завершающаяся числом 0. Выведите все нечетные положительные числа из этой
     * последовательности, сохраняя их порядок.
     * 
     * @return odd sequence numbers.
     */
    public String getOddSequenceNumbers() {
        int n = in.nextInt();
        String numbers = "";
        if (n != 0) {
            if (n > 0 & n % 2 != 0) {
                numbers = n + "; " + getOddSequenceNumbers();
            } else {
                numbers += getOddSequenceNumbers();
            }
        }
        return numbers;
    }

    /**
     * Дано слово из строчных латинских букв. Проверить, является ли оно
     * палиндромом.
     * 
     * @param input any input word.
     * @return is the word palindrome or not.
     */
    public String palindromeCheck(String input) {
        if (input.length() == 1) {
            return "является палиндромом.";
        } else {
            if (input.substring(0, 1).equals(input.substring(input.length() - 1, input.length()))) {
                if (input.length() == 2) {
                    return "является палиндромом.";
                }
                return palindromeCheck(input.substring(1, input.length() - 1));
            } else {
                return "не является палиндромом.";
            }
        }
    }

    /**
     * Дано натуральное число N. Выведите все его цифры по одной, в обратном
     * порядке, разделяя их пробелами.
     * 
     * @param string any input string.
     * @return numbers in reverse order separated by a space.
     */
    public String getNumbersReverseOrder(String string) {
        return string.isEmpty() ? "" : getNumbersReverseOrder(string.substring(1)) + " " + string.charAt(0);
    }
}
