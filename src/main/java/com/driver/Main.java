package com.driver;
public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int firstAnsValue = p.product(2, 3);
        int secondAnswerValue = p.product(2, 3, 4);
        double thirdAnswerValue = p.product(2.1, 2.9);
    }

    public static class Product {
        public static int product(int x, int y) {
            int ans = x * y;
            return ans;
        }

        public static int product(int x, int y, int z) {
            int secondAnswer = x * y * z;
            return secondAnswer;
        }

        public static double product(double x, double y) {
            double thirdAnswer = x * y;
            return thirdAnswer;
        }
    }
}