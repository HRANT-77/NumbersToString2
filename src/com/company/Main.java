package com.company;

public class Main {
    public static void main(String[] args) {

        String ans = "";
        String hazar = "հազար ";
        String million = "միլիոն ";
        String milliard = "միլիարդ ";
        String trillion = "տրիլիոն ";
        String kvadrillion = "կվադրիլիոն ";

        long num = 913867792531107814L;
        String s = Long.toString(num);
        long [] digits=numToArr(num);

        long s1=digits[digits.length-18]*100+digits[digits.length-17]*10+digits[digits.length-16];
        long s2=digits[digits.length-15]*100+digits[digits.length-14]*10+digits[digits.length-13];
        long s3=digits[digits.length-12]*100+digits[digits.length-11]*10+digits[digits.length-10];
        long s4=digits[digits.length-9]*100+digits[digits.length-8]*10+digits[digits.length-7];
        long s5=digits[digits.length-6]*100+digits[digits.length-5]*10+digits[digits.length-4];
        long s6=digits[digits.length-3]*100+digits[digits.length-2]*10+digits[digits.length-1];

        if(s1!=0){
            ans=ans+attributeStr(s1)+" "+kvadrillion;
        }
        if(s2!=0){
            ans=ans+attributeStr(s2)+" "+trillion;
        }
        if(s3!=0){
            ans=ans+attributeStr(s3)+" "+milliard;
        }
        if(s4!=0){
            ans=ans+attributeStr(s4)+" "+million;
        }
        if(5!=0){
            ans=ans+attributeStr(s5)+" "+hazar;
        }
        if(s6!=0){
            ans=ans+attributeStr(s6);
        }

        System.out.println(ans);
        System.out.println(num);
    }

    public static String attributeStr(long x) {
        String digit = "";
        String haryur = "հարյուր ";

        String[] mianish = new String[10];
        mianish[0] = "";
        mianish[1] = "մեկ";
        mianish[2] = "երկու";
        mianish[3] = "երեք";
        mianish[4] = "չորս";
        mianish[5] = "հինգ";
        mianish[6] = "վեց";
        mianish[7] = "յոթ";
        mianish[8] = "ութ";
        mianish[9] = "ինը";

        String[] erknish = new String[10];
        erknish[0] = "";
        erknish[1] = "տաս";
        erknish[2] = "քսան";
        erknish[3] = "երեսուն";
        erknish[4] = "քառասուն";
        erknish[5] = "հիսուն";
        erknish[6] = "վաթսուն";
        erknish[7] = "յոթասուն";
        erknish[8] = "ութսուն";
        erknish[9] = "իննսուն";

        if (x / 100 > 0 & x / 100 != 1) {
            digit = mianish[(int) (x / 100)] + " " + haryur;
        }
        if (x / 100 == 1) {
            digit = haryur;
        }
        if ((x / 10) - (x / 100) * 10 != 1) {
            digit = digit + erknish[(int) ((x / 10) - (x / 100) * 10)];
        }
        if ((x / 10) - (x / 100) * 10 == 1 & x - (x / 10) * 10 > 0) {
            digit = digit + erknish[(int) ((x / 10) - (x / 100) * 10)] + "ն";
        }
        if ((x / 10) - (x / 100) * 10 == 1 & (x - (x / 10) * 10) == 0) {
            digit = digit + erknish[(int) ((x / 10) - (x / 100) * 10)];
        }
        if (x - (x / 10) * 10 > 0) {
            digit = digit + mianish[(int) (x - (x / 10) * 10)];
        }
        return digit;
    }
    public static long [] numToArr(long x){
        String s = Long.toString( x);
        int size=18;
        long[] arr = new long[size];
        for (int i = size - 1; i >= 0; i--) {
            arr[i] =  x % 10;
            x /= 10;
        }
        return arr;
    }
}
