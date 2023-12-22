/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tasks;

/**
 *
 * @author 99450
 */
public class Tasks {

    public static void main(String[] args) {
        
        //bir string verilib hemin stringi eksine cevirin Salam - malas
        System.out.println(inverseString("Salam"));
        
        //adlardan ibaret string arrayi verilib hemin arrayde herflerinin sayi en cox olan adi tapin
        String[] names={"Səbinə","Əli","Fidan"};
        System.out.println(longestString(names));
        
        //x ve y ededleri verilib hemin ededlerin 2e bolunenlerinin cemini tapin 
        System.out.println(sumOfOddNumbers(4,10));
        
        //a ve b ededleri verilib a-nin b quvvetini tapin
        System.out.println(powerOfNumber(2,6));
          
        //2nin quvveti olan bir tam eded verilib bu ededinin 2nin necenci quvvetini oldugunu tapin  
        System.out.println(findExponentOfBase2(64));
        
        //ededlerden ibaret array verilib hemin arrayin ededlerinin ededi ortasini tapin  
        int[] numbers={5,8,9,4,5};
        System.out.println(averageOfArray(numbers));


    }
    
    static String inverseString(String word){
        String inversed="";
        for (int i = word.length()-1; i>=0; i--) {
           inversed+=word.charAt(i);
        }
        return inversed;
    }
    
    static String longestString(String[] names){
        
        String max = names[0];
        for (int i = 1; i < names.length; i++) {
            if(max.length()<names[i].length()){
                max=names[i];
            }
        }
        return max;
    }
    
    static int sumOfOddNumbers(int firstNumber,int secondNumber){
        int sum=0;
          for (int i = firstNumber; i < secondNumber; i++) {
              if (i%2==0) {
                  sum+=i;
              }
          }
          return sum;
    }
    
    static int powerOfNumber(int base,int exponent){
          int result=1;
          for (int i = 1; i <= exponent; i++) {
            result*=base;
        }
          return result;
    }
    
    static int findExponentOfBase2(int result){
          int exponent=0;
          while(result>1){
              result/=2;
            exponent++;
        }
        return exponent;
    }
    
    static float averageOfArray(int[] array){
        float sum=0;
          float average = 0;
          for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            average=sum/array.length;
        }
          return average;
    }
}
