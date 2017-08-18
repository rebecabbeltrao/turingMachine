package turingMachine;

import util.ReadFile;

import javax.rmi.CORBA.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	static turingMachine machine = new turingMachine();
	private static Scanner input = new Scanner(System.in);
	private static Scanner input2 = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		initialize();
		String option;
		String stringInput;
		do{
		System.out.println("-- initialize --");
		System.out.println("Enter your String");
		stringInput = input.next();
		System.out.println("Chose a number that correspond to an option below:");
		System.out.println("1 - Run at full speed ");
		System.out.println("2 - Run step by step");
		System.out.println("3 - Change words");
		System.out.println("4 - end");
		System.out.println("Type your option:");
		option = input2.nextLine();
		run(option.trim(), stringInput);



		
		} while(option != "4");	
	}
	public static void initialize() {
		System.out.println("-- initialized machine --");



	}
	
	public static void run(String option, String stringInput) throws IOException {
		int teste = 6;

		ReadFile readFile = new ReadFile();
		ArrayList<String[]> transicoes = readFile.getTransicoes();
		machine.setTransicoes(transicoes);
		machine.setStringInput(stringInput.split(""));

		machine.runFullSpeed();

		switch(teste){
		case 1: option = "1";
			System.out.print("oi");
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
