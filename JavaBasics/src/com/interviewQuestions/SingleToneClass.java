package com.interviewQuestions;

public final class SingleToneClass {

	private static SingleToneClass stc = null;

	private SingleToneClass() {

	}

	public static SingleToneClass getInstance() {
		return (stc == null) ? stc = new SingleToneClass() : stc;
	}

	public static void main(String[] args) {
		
		SingleToneClass s1 = SingleToneClass.getInstance();
		SingleToneClass s2 = SingleToneClass.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);

	}

}
