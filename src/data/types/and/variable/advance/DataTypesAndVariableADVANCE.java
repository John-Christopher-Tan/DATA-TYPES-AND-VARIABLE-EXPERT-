/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data.types.and.variable.advance;


public class DataTypesAndVariableADVANCE {

    
    public static void main(String[] args) {
        byte number = 127;
        number++;
        System.out.println("Byte Overflow Result: " + number);

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));

        int[] numbers1 = {10, 20, 30};
        int[] numbers2 = numbers1;
        numbers2[0] = 99;

//why the comparison produced as it did
// 1. (s1 == s2) -> TRUE because both use string literals ("Java"), so they share the exact same reference in the String.
// 2. (s1 == s3) -> FALSE because 'new String()' forces Java to create a new object in memory with a different variable.
        System.out.println("numbers1: [" + numbers1[0] + ", " + numbers1[1] + ", " + numbers1[2] + "]");
        System.out.println("numbers2: [" + numbers2[0] + ", " + numbers2[1] + ", " + numbers2[2] + "]");
    }
    
}
