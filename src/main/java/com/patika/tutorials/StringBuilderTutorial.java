package com.patika.tutorials;

public class StringBuilderTutorial {
    public static void main(String[] args) {
        //1.YOL
        String adi="Turgay";
        String soyadi="Dede";
        System.out.println(adi+" "+soyadi);

        //2.YOL
        String result="Turgay".concat(" Dede");
        System.out.println(result);

        //3.YOL //Servis,Database, karşı taraftan ne geleceğini bilmiyorsam
        // Asenkron: aynı anda birden fazla iş yapabilme yeteneği
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("").append("Turgay").append(" Dede").append("");
        String result2=stringBuilder.toString();
        System.out.println(result2);


        //4.YOL güvenli:
        // Senkron: aynı anda sadece bir iş yapabilme yeteneği
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("").append("Turgay").append(" Dede").append("");
        String result3=stringBuilder.toString();
        System.out.println(result3);
    }
}
