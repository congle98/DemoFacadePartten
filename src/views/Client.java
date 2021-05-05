package views;

import model.*;

public class Client {
    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade(new ListFilter(),new ListPrinter(),new RandomList(),new RandomNumber());
        randomListFacade.printRandomEvenList(1,100);
    }
}
