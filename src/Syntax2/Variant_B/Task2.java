package Syntax2.Variant_B;

import java.util.Random;

/**
 * Created by tenom on 09.04.2016.
 */

//        С помощью функции random() сгенерировать массив чисел от 0 до 50 и
//        определить количество четных и нечетных чисел в этом массиве. Для
//        определения четных и нечетных чисел использовать функцию.
public class Task2
{
    // Размер массива и макс. граница генерации....
        private int size = 50;
        // Массив..
        private int[] RandomArray = new int[size];

        // Возвращает сгенерированый массив.
        public int[] getRandomArray() {
            return this.RandomArray;
        }

        // Конструктор принимающий параметр сайз.
        public Task2(int size) {
            // Вызов метода доступа. принимает размер массива и заполняет его элементами
            this.setSizeArray(size);
        }
        // Сам метод доступа. принимает размер массива и заполняет его элементами
        public void setSizeArray(int size) {
            this.size = size;
            // Вызов функкии заполняющей массив
            this.BuildRandomArray();
        }
        // Возвращает размер массива
        public int getSizeArray() {
            return this.size;
        }

        // сама функция заполняющая массив случайными числами
        private void BuildRandomArray() {
            // Создаем экземпляр класса рандом.
            Random random = new Random();
            for (int i = 0; i < this.RandomArray.length; i++) {
                // используем экземпляр класса рандом для присовоения итого элеманта случайного числа.
                this.RandomArray[i] = random.nextInt(size);
            }
        }



        // Считает количество четных элементов во входящем массиве
        public int CountEvenNumbersInArray(int[] array)
        {
            // Здесь храним результат...
            int counterEvenNumbers = 0;
            for (int i = 0; i < array.length; i++) {
                if (CheckCurentNumber(array[i])) // вызывает функцию проверки на  четность
                    counterEvenNumbers++;
            }
            return counterEvenNumbers;
        }

        public int CountOddNumbersInArray(int[] array) {
            int counterOddNumbers = 0;
            for (int i = 0; i < array.length; i++) {
                if (! CheckCurentNumber(array[i]))    // вызывает функцию проверки на  четность со знаком не
                    // (тоесть если не четное) +1
                    counterOddNumbers++;
            }
            return counterOddNumbers;
        }
        // Проверка числа на четность. Возращает да/нет
        public boolean CheckCurentNumber(int number) {
            if ((number & 1) == 0)     // побиовая операция (Автор Юлия)
                // Если послдний бит числа равен 0 - число четное. возвращает "да"
                return true;
            else return false;         // Иначе не четное. возвращает "нет"
        }

}
