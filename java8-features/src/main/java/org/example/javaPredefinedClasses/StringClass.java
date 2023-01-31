package org.example.javaPredefinedClasses;

import java.util.stream.Stream;

public class StringClass {

    private int findFrequencyOfCharacter() {
        String text = "Hi, this is test";

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'i') {
                count++;
            }
        }

        System.out.println("Frequency of i is: " + count);


        return count;
    }

    /**
     * The compareTo() method compares two strings lexicographically.
     * The comparison is based on the Unicode value of each character in the strings.
     * returns 0 if the string is equal to the other string
     * A value less than 0 is returned if the string is less than the other string (less characters) and
     * a value greater than 0 if the string is greater than the other string (more characters)
     * @return
     */
    private void compareTo() {
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("Strings are equal " + str1.compareTo(str2));

        String str3 = "Hello";
        String str4 = "Helloo";

        System.out.println("Strings are not equal " + str3.compareTo(str4));


        String str5 = "Hello";
        String str6 = "hello";

        System.out.println("Strings are equal but not case similar " + str5.compareToIgnoreCase(str6));
    }

    /**
     * The equals() method compares two strings,
     * and returns true if the strings are equal, and false if not.
     */
    private void checkStringAreEqual() {
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";

        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr1.equals(myStr3)); // false

        String myStr4 = "hello";
        System.out.println(myStr1.equals(myStr4));
        System.out.println(myStr1.equalsIgnoreCase(myStr4));
    }

    /**
     * The concat() method appends (concatenate) a string to the end of another string.
     */
    private void stringConcat() {
        String firstName = "John ";
        String lastName = "Doe";

        System.out.println(firstName.concat(lastName));
    }

    private void stringReplace() {
        String myStr = "Hello";

        System.out.println(myStr.replace('l', 'p')); // Heppo
        System.out.println(myStr.replace("ll", "pp")); // Heppo
        System.out.println(myStr.replace("llo", "opo")); // Heopo
        System.out.println(myStr.replace("lloo", "opo")); // Hello
    }

    private void stringContains() {
        String myStr = "Hello";

        System.out.println(myStr.contains("Hel")); // true
        System.out.println(myStr.contains("e")); // true
        System.out.println(myStr.contains("Hi")); // false
        System.out.println(myStr.contains("")); // true
        System.out.println(myStr.contains(" ")); // false
     //   System.out.println(myStr.contains(null)); // NullPointerException
    }

    /**
     * The endsWith() method checks whether a string ends with the specified character(s).
     * The startsWith() method checks whether a string starts with the specified character(s).
     */
    private void stringEndWithOrStartWith() {
        String myStr = "Hello";

        System.out.println(myStr.endsWith("Hel"));   // false
        System.out.println(myStr.endsWith("llo"));   // true
        System.out.println(myStr.endsWith("o"));     // true


        String myStr2 = "Hello";
        System.out.println(myStr2.startsWith("Hel"));   // true
        System.out.println(myStr2.startsWith("llo"));   // false
        System.out.println(myStr2.startsWith("o"));     // false
    }

    /**
     * The trim() method removes whitespace from both ends of a string.
     */
    private void stringTrim() {
        String myStr = "       Hello World!       ";

        System.out.println(myStr);
        System.out.println(myStr.trim());
    }

    public static void main(String[] args) {
        StringClass stringClass = new StringClass();

        stringClass.findFrequencyOfCharacter();

        stringClass.checkStringAreEqual();
        stringClass.compareTo();

        stringClass.stringConcat();

        stringClass.stringContains();

        stringClass.stringEndWithOrStartWith();

        stringClass.stringTrim();

        stringClass.stringReplace();
    }
}
