package ru.netology.sqr;

public class SQRService {

    public int countSqr(int firstValue, int secondValue) {
        int count = 0;
        int firstBorder = 10;
        int secondBorder = 99;

        while (firstBorder * firstBorder < firstValue) {
            firstBorder++;
            if (firstBorder > secondBorder) {
                return count;
            }
        }

        while (firstBorder * firstBorder <= secondValue) {
            count++;
            firstBorder++;
            if (firstBorder > secondBorder) {
                break;
            }
        }
        return count;
    }
}
