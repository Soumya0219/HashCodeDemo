package com.company;

public class HashCodeDemo {

    public static void main(String[] args) {
    String a="Soumya";
    String b="thota";
    if(a.equals(b)){
        System.out.println("Equal varaibles:");
        System.out.println(a.hashCode() + "\n" + b.hashCode());


    }
    String c="thota";
    String d="soma";
    if(!c.equals(d)){
        System.out.println("Unequal varaibles:");
        System.out.println(c.hashCode() + "\n" + d.hashCode());
    }
    }
}
