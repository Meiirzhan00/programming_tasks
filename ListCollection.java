package com.petehouston.tutorial.java;

import java.util.*;

public class TempClass extends Object{

   public static void main(String[] args) {
//       List<Integer> list = new ArrayList<>();
//       list.add(5);
//       list.add(7);
//       list.add(1,9);
//       list.set(1,2);
//
//       System.out.println(list.get(0));
//       System.out.println(list.size());
//
//       for(int i=0; i<list.size(); i++){
//           System.out.println(list.get(i));
//       }

//       Scanner sc = new Scanner(System.in);
//       List<Integer> myList = new ArrayList<>(4);
//       boolean flag = true;
//       while (flag){
//           String strNumbers = sc.nextLine();
//           if(strNumbers.isEmpty()) break;
//
//           int numbers = Integer.parseInt(strNumbers);
//           myList.add(numbers);
//
//       }
//
//       System.out.println(myList);

//       LinkedList<Integer> listNumbers = new LinkedList<>();
//       Scanner sc = new Scanner(System.in);
//       int flag = sc.nextInt();
//
//       while (flag > 0){
//           int myNumbers = sc.nextInt();
//
//           if(myNumbers%2 != 0) listNumbers.addLast(myNumbers);
//           else listNumbers.addFirst(myNumbers);
//
//           flag--;
//       }
//
//       System.out.println(listNumbers);

//       List<Integer> mylist = new ArrayList<>();
//       Scanner input = new Scanner(System.in);
//
//       int flag = input.nextInt();
//
//       while (flag>0){
//           int mynumbers = input.nextInt();
//           mylist.add(mynumbers);
//           flag--;
//       }
//
//       mylist.removeIf(x -> x > 5);
//
//       System.out.println(mylist);

//       List<String> myStrList = new ArrayList<>();
//       Scanner input = new Scanner(System.in);
//
//       for (int i=0; i<5; i++){
//           String myStr = input.next();
//           myStrList.add(myStr);
//       }
//
//       for (int j=0; j<5; j++){
//           if(myStrList.get(j).length()>3) System.out.println(myStrList.get(j));
//       }

       List<Integer> mySixNum = new ArrayList<>(6);
       List<Integer> threeDivL = new ArrayList<>();
       List<Integer> twoDivL = new ArrayList<>();
       List<Integer> otherNum = new ArrayList<>();
       List<List> myLists = new ArrayList<>();

       Scanner input = new Scanner(System.in);
       for (int j=0; j<6; j++){
           int myNum = input.nextInt();
           mySixNum.add(myNum);
       }

       for (int i=0; i<6; i++){
           if (mySixNum.get(i) % 2 == 0 && mySixNum.get(i) % 3 == 0) { threeDivL.add(mySixNum.get(i)); twoDivL.add(mySixNum.get(i));}
           else if (mySixNum.get(i) % 3 == 0) threeDivL.add(mySixNum.get(i));
           else if (mySixNum.get(i) % 2 == 0) twoDivL.add(mySixNum.get(i));
           else otherNum.add(mySixNum.get(i));
       }

       myLists.add( threeDivL);
       myLists.add( twoDivL);
       myLists.add(otherNum);

       printList(myLists);
   }

   public static void printList(List<List> myLists ){
       for (int i=0; i<myLists.size(); i++){
           System.out.println(myLists.get(i));
       }
   }
}
