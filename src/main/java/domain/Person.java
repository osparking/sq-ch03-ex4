package domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Person {
	private String name = "철수";

	@Autowired
	private Parrot parrot;
}
