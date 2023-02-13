package org.example.commonProblems.strings;

/**
 *  Java Pattern matching techniques
 * 1. Using java regex util class - Pattern.matches()
 *      boolean match = Pattern.matches(pattern, str);
 * 2. Using text length() property and chatAt() - here implemented
 * 3. Using String indexOf()
 *      string.indexOf(chars)
 * 4. Using String contains()
 *      string.contains(chars)
 */
public class StringPattern {

    public int strStr(String text, String pattern) {
        //
        if (text == null || pattern == null || (pattern.length() > text.length())) {
            return -1;
        }

        int i = 0;
        int last = text.length();

        // loop until text length
        while (i < last) {
            if (text.charAt(i) == pattern.charAt(0)) { // get pattern zero index character and get it's match with text character
                boolean equal = true;

                // loop trough pattern character iteratively
                for (int j = 0; j < pattern.length() && equal; ++j) {
                    if (text.charAt(i + j) != pattern.charAt(j)) { // if pattern is mismatch with text value set equal as false
                        equal = false;
                    }
                }

                if (equal) { // if pattern is match inside the text, return first occurrence
                    return i;
                }
            }
            ++i;
        }

        return -1;
    }

    public int indexOfAny(String string, String chars) {
        if (string.indexOf(chars) > -1)
            return string.indexOf(chars);
        else
            return -1;
    }

    public int usingContains(String string, String chars) {
        if (string.contains(chars))
            return string.indexOf(chars);
        else
            return -1;
    }

    public static void main(String[] args) {
        StringPattern stringPattern = new StringPattern();

        System.out.println(stringPattern.strStr("Testee", "ee"));
        System.out.println(stringPattern.strStr("", "e"));
        System.out.println(stringPattern.strStr("Test", "Test"));

        System.out.println(stringPattern.indexOfAny("Testee", "ee"));
        System.out.println(stringPattern.indexOfAny("", "e"));
        System.out.println(stringPattern.indexOfAny("Test", "Test"));

        System.out.println(stringPattern.usingContains("Testee", "ee"));
        System.out.println(stringPattern.usingContains("", "e"));
        System.out.println(stringPattern.usingContains("Test", "Test"));
    }
}
