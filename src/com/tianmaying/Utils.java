package com.tianmaying;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    
    public static <T extends Comparable<T>> T getMax(T t1, T t2) {
    	/* T extends Comparable<T>表示泛型T必须继承Comparable<T>接口。
		 * 继承Comparable<T>接口的类将实现compareTo方法，
		 * 我们可以通过compareTo方法来判断两个对象的大小，
		 * 所有包装类都实现了该方法。
    	 */
        // your code here
    	List<Integer> ls = new ArrayList<>();
		return t1.compareTo(t2) > 0 ? t1 : t2;
        //return t1;
    }
    
    public static void main(String[] args) {
        System.out.println(getMax(1, 2));
        System.out.println(getMax(2l, 3l));
        System.out.println(getMax("3", "4"));
    }

}