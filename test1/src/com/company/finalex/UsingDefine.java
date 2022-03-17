package com.company.finalex;

public class UsingDefine {
    public static void main(String[] args) {
        //Define de = new Define();
        //de.GOOD_MORNING;

        System.out.println(Define.GOOD_MORNING);
        System.out.println("최소값은" + Define.MIN + "입니다.");
        System.out.println("최대값은" + Define.MAX + "입니다.");
        System.out.println("수학 과목 코드 값은" + Define.MATH + "입니다.");
        System.out.println("영어 과목 코드 값은" + Define.ENG + "입니다.");
    }
}
