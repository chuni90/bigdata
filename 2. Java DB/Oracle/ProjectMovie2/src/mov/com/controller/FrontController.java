package mov.com.controller;

import java.util.Scanner;

import mov.com.action.Action;

public class FrontController {
	public void process(Action action, Scanner sc) {

		action.execute(sc);
		
	}

}