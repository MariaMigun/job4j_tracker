package ru.job4j.max;

public class Reduce {
        private int[] array;

        public void to(int[] array) {
            this.array = array;
        }

        public void print() {
            for (int index = 0; index < array.length; index++) {
                System.out.println(array[index]);
            }
        }

        public static void main(String[] args) {
            int[] arra = {1, 2, 3};
            ru.job4j.max.Reduce reduce = new ru.job4j.max.Reduce();
            reduce.to(arra);
            reduce.print();
        }
}
