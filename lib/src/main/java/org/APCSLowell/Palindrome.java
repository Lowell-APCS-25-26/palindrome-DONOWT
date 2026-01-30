package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        return reverse(s).equals(reverse(reverse(s)));
    }
    public String reverse(String s) {
        String n = new String(s.toLowerCase());
        String a = new String("");
        String b = new String("");
        for (int i = 0; i < n.length(); i++) {
            if (Character.isLetter(n.charAt(i))) {
                a = a + n.substring(i,i+1);
            }
        }
        for (int i = a.length()-1; i >= 0; i--) {
            b = (b + a.substring(i,i+1));
        }
        return b;
    }
}
