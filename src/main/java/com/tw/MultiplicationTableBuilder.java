package com.tw;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.calculateRepresentsString(start, end);
        System.out.println(multiplicationTable);
    }

    public  Boolean isRangeNumber(int number) {
        return number > 1 && number <= 1000;
    }

    public  Boolean isGreaterTen(int start, int end) {
        return  start <= end;
    }

    public  String calculateRepresentsString(int start, int end) {
        if (!isRangeNumber(start) || !isRangeNumber(start) || !isGreaterTen(start, end)) {
            return null;
        }
        return IntStream.rangeClosed(start, end)
                .mapToObj(i -> generateTemplateRow(start, i))
                .collect(Collectors.joining("\n"));
    }

    public  String generateTemplateRow(int start, int row) {
        return IntStream.rangeClosed(start, row)
                .mapToObj(i -> i + "*" + row + "=" + (i * row))
                .collect(Collectors.joining(" "));
    }

}