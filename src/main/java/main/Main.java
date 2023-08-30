package main;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import domain.Person;

public class Main {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var charles = context.getBean(Person.class);
		var ps = new PrintStream(System.out, true, UTF_8);
		ps.println(charles);
	}
}
