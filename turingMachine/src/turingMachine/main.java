package turingMachine;

import util.ReadFile;

import javax.rmi.CORBA.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	static turingMachine machine = new turingMachine();
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		initialize();
		String option;
		do{
		System.out.println("-- initialize --");
		System.out.println("Chose a number that correspond to an option below:");
		System.out.println("1 - Run at full speed ");
		System.out.println("2 - Run step by step");
		System.out.println("3 - Change words");
		System.out.println("4 - end");
		System.out.println("Type your option:");
		option = input.nextLine();
		run(option.trim());


		
		} while(option != "4");	
	}
	public static void initialize() throws IOException {
		System.out.println("-- initialized machine --");

		ReadFile readFile = new ReadFile();
		ArrayList<String[]> transicoes = readFile.getTransicoes();
		machine.setTransicoes(transicoes);
		//Util util = new Util();
		//util.syso(transicoes);

	}
	
	public static void run(String option){
		int teste = 6;
		switch(teste){
		case 1: option = "1";
			machine.runFullSpeed();
		case 2: option = "2";
			machine.stepByStep();
		case 3: option = "3";
			System.out.println("Type new word:");
			String word = input.nextLine();
			machine.changeWord(word);
		case 4: option = "4";
			machine.end();
		}
	}
	
	public static void printAll(){
		printTape();
		printHead();
		printCurrentState();
		printSteps();
		
	}
	private static void printCurrentState() {
		System.out.println("Current State [ " + machine.currentState()+ " ]");
		
	}
	private static void printSteps() {
		System.out.println("Number of Steps [ " + machine.steps() + " ]");
		
	}
	private static void printHead() {
		
		
	}
	private static void printTape() {
		
	}
	
	
}
