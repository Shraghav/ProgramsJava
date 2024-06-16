//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {
    static int valueOf(char i) {
        HashMap<Character, Integer> hm = new HashMap();
        hm.put('+', 1);
        hm.put('-', 1);
        hm.put('/', 2);
        hm.put('*', 2);
        hm.put('^', 3);
        return (Integer)hm.get(i);
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        String word = "A * B + C * D";

        for(int i = 0; i < word.length(); ++i) {
            if (word.charAt(i) != ' ') {
                if (word.charAt(i) != '+' && word.charAt(i) != '-' && word.charAt(i) != '/' && word.charAt(i) != '*') {
                    System.out.print(word.charAt(i));
                } else if (st.isEmpty()) {
                    st.push(word.charAt(i));
                } else if (valueOf(word.charAt(i)) > valueOf((Character)st.peek())) {
                    st.push(word.charAt(i));
                } else {
                    while(!st.isEmpty() && valueOf(word.charAt(i)) <= valueOf((Character)st.peek())) {
                        System.out.print(st.pop());
                    }

                    st.push(word.charAt(i));
                    if (word.charAt(i) == '(') {
                        st.push(word.charAt(i));
                    } else if (word.charAt(i) == ')') {
                        while(!st.isEmpty()) {
                            if ((Character)st.peek() != '(') {
                                System.out.print(st.pop());
                            }
                        }
                    }
                }
            }
        }

        while(!st.isEmpty()) {
            System.out.print(st.pop());
        }

    }
}
