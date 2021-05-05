package model;

import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private RandomNumber randomNumber;

    public RandomListFacade(ListFilter listFilter, ListPrinter listPrinter, RandomList randomList, RandomNumber randomNumber) {
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
        this.randomList = randomList;
        this.randomNumber = randomNumber;
    }

    public  void printRandomEvenList(int min, int max){
        int sizeList = randomNumber.generateInteger(min,max);
        int minNumber = randomNumber.generateInteger(min,max);
        int maxNumber = randomNumber.generateInteger(min,max);
        List<Integer> list = randomList.generateList(sizeList,minNumber,maxNumber);
        List<Integer> filter = listFilter.filterOdd(list);
        listPrinter.printList(filter);
    }
}
