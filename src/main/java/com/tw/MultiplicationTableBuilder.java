package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 9;
        System.out.println(builder.isRangeNumber(start, end));
        System.out.println(builder.isGreaterThen(start, end));
    }

    public Boolean isRangeNumber(int start, int end) {
        return start > 1 && start <= 1000 && end > 1;
    }

    public Boolean isGreaterThen(int start, int end) {
        return end <= 1000 && start <= end;
    }


    // 生成单行的乘法表
    public String generateTemplateRow(int start, int row) {
        StringBuilder representsString = new StringBuilder();
        for (int i = start; i <= row; i++) {
            representsString.append(i).append("*").append(row).append("=").append(i * row).append(" ");
        }
        return representsString.toString();
    }

}
//2*2=4
//2*3=6 3*3=9
//2*4=8 3*4=12 4*4=16