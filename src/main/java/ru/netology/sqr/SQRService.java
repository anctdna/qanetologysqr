package ru.netology.sqr;

public class SQRService {

   public int countSqr(int a, int b) {
       int z = 0;
       int x = 10;
       int y = 99;

       while(x*x < a) {
           x++;
           if (x > y) {
               return z;
           }
       }

       while(x*x <= b) {
           z++;
           x++;
           if (x > y) {
               break;
           }
       }
       return z;
   }
}
