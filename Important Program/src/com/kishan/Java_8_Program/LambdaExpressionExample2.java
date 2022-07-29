/*
 * package com.kishan.Java_8_Program;
 * 
 * import java.util.function.Function;
 * 
 * 
 * public class MyFunctionInterface implements Squarable { public static void
 * main(String args[]) { Squarable sqr = ()->System.out.println("Hello");
 * sqr.square(); }
 * 
 * @Override public void square() { // TODO Auto-generated method stub
 * 
 * } }
 */
  package com.kishan.Java_8_Program;

@FunctionalInterface  //It is optional  
interface Drawable{  
    public void draw();  
}  
  
public class LambdaExpressionExample2 {  
    public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        Drawable d2=()-> 
            System.out.println("Drawing "+width);  
          
        d2.draw();  
    }  
}  