package com.study.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TddApplication {

	public static void main(String[] args) {
		NoTddValidator noTddValidator = new NoTddValidator();
		//0
		System.out.println(noTddValidator.validate("dfsdf"));
		//1
		System.out.println(noTddValidator.validate("dfsdfsdfsdf"));
		//2
		System.out.println(noTddValidator.validate("d4dfsfsdf"));
		//3
		System.out.println(noTddValidator.validate("d4Adfsfsdf"));

		//약
		System.out.println(noTddValidator.getLevel(noTddValidator.validate("dfsdf")));
		//중
		System.out.println(noTddValidator.getLevel(noTddValidator.validate("d4dfsfsdf")));
		//강
		System.out.println(noTddValidator.getLevel(noTddValidator.validate("d4Adfsfsdf")));
	}

}
