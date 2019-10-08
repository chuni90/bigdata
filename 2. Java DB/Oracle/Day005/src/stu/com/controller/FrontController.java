package stu.com.controller;

import java.util.Scanner;

import stu.com.action.Action;

public class FrontController {

	public void process(Action action, Scanner sc) {

		action.execute(sc);
	}

}
