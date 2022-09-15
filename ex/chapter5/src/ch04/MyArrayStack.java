package ch04;

import ch02.MyArray;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {

        if(isFull()) {
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }
    // 요소를 추가하는 메서드

    public int pop() {

        if(isEmpty()) {

            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.removeElement(--top);
    }
    // 요소를 제거하는 메서드

    public int peek() {

        if(isEmpty()) {

            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.getElement(top-1);
    }
    // 마지막 요소를 보여주는 메서드

    public boolean isFull() {

        if(top == arrayStack.ARRAY_SIZE) {
            return true;
        }
        else return false;
    }
    // 배열로 만들었기 때문에, 배열 안에 요소가 꽉 차있는지부터 체크하는 메서드 생성

    public boolean isEmpty() {

        if(top == 0) {
            return true;
        }
        else return false;
    }

    public void printAll() {
        arrayStack.printAll();
    }
}
