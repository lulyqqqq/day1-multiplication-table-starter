package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);
        System.out.println(builder.checkNumber(start,end));
        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }

    public boolean checkNumber(int start, int end){
        return start>1 && start <= 1000 && end > 1 && end <= 1000 && start <= end;
    }
}
