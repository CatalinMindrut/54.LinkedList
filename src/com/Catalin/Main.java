package com.Catalin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /**
         * Index    Adress  Value
         *  0        100      34
         *  1        104      18
         *  2        108      91
         *  3        112      57
         *  4        116      453
         *  5        120      68
         *  6        124      6
         *
         * As we already know, in an array, index position 0 grabs value 34, index position 1 grabs value 18 and so on.
         * Now what happens internally, is that Java will actually allocate 4 bytes of memory for each integer.
         * Unlike primitive data types that have a known fixed memory allocation (4 bytes for an int, 8 for a double,
         * etc.) Strings do not have a set memory allocation.
         * To handle this, Java will create a String Address of 8 bytes, that in turn points to another address location
         * in memory, where the String is stored.
         */

        Customer customer = new Customer("Catalin", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
        /** Running the code will return a value of 12.18 for the balance. So is the value set for the second class
         * affecting the value of the first one?
         * anotherCustomer = customer; internally Java was assigning the second class to point to the first class,
         * in other words it just saved in the memory address, it did not create a separate class.
         * In fact we are only using one class here, because the customer class is the first class but the second class
         * is pointing to the first class as well.
         * Setting the balance value for the second class will update the first class.
         */

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);
        /** The first number is the index, aka the position in the array and the second number is the value for that
         * index position. In this case element 1 of the array will have the value of 2. Keep in mind that the array
         * starts from 0 so element 1 is actually the second position in the array.
         */

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
        /** Running this you will notice that the first printout will return the 3 listed elements but the second
         * printout will return 4 elements. The insert used at the end did not replace the element at index 1, it just
         * inserted the element and the rest of the elements had to be moved down.
         * The same stands for removing an element. The entire list has to be moved up one position.
         * This is not a problem in examples like these but when a computer has to process and reposition lists of
         * thousands or millions of elements, this process can become very slow.
         */
        /** Unlike array lists, a linked list actually links the elements, each  element points to the next one, like
         * light bulbs linked in a serial connection. Adding or removing a light bulb means that you will add another
         * cable that connects the new light bulb to the rest of the bulbs, you do not have to move the bulbs at all.
         * Check the images in the video, very intuitive...
         */

    }
}
