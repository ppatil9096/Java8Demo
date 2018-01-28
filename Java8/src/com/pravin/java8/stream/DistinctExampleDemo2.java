package com.pravin.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DistinctExampleDemo2 {
    public static void main(String[] args) {
	PersonBeanClass personClass1 = new PersonBeanClass("Pravin", "Patil", 1);
	PersonBeanClass personClass2 = new PersonBeanClass("Prakash", "Patil", 2);
	PersonBeanClass personClass3 = new PersonBeanClass("Akshay", "Patil", 3);

	List<PersonBeanClass> list = Arrays.asList(personClass1, personClass2, personClass3, personClass2,
		personClass3);
	List<PersonBeanClass> distinctList = list.stream()
		.filter(distinctByKey(p -> p.getLname()))
		.collect(Collectors.toList());
	System.out.println(distinctList);
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, Object> key) {
	Map<Object, Boolean> map = new ConcurrentHashMap<>();
	return t -> map.putIfAbsent(key.apply(t), Boolean.TRUE) == null;
    }
}
