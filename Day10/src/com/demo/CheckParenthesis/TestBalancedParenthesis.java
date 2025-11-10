package com.demo.CheckParenthesis;

public class TestBalancedParenthesis {

	private static boolean checkParenthesis(String str1) {
		// TODO Auto-generated method stub

		MyStackListGeneric<Character> st = new MyStackListGeneric<>();
		for (int i = 0; i < str1.length(); i++) {
			Character ch = str1.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else {
				if (st.isEmpty()) {
					return false;
				} else {
					Character ch2 = st.pop();
					switch (ch) {
					case ']' -> {
						if (ch2 != '[') {
							return false;
						}
					}
					case ')' -> {
						if (ch2 != '(') {
							return false;
						}
					}
					case '}' -> {
						if (ch2 != '{') {
							return false;
						}
					}

					}
				}
			}
		}
		return st.isEmpty();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "{{[](){[]}}}";
		String str2 = "{{}[{]}}";
		String str3 = "({[][]({{}})}";
		boolean status = checkParenthesis(str1);
		if (status) {
			System.out.println("balanced Parenthesis");
		} else {
			System.out.println("unbalanced parenthesis");
		}

		status = checkParenthesis(str2);
		if (status) {
			System.out.println("balanced Parenthesis");
		} else {
			System.out.println("unbalanced parenthesis");
		}

		status = checkParenthesis(str3);
		if (status) {
			System.out.println("balanced Parenthesis");
		} else {
			System.out.println("unbalanced parenthesis");
		}

	}

}
