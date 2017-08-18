package turingMachine;

import java.util.ArrayList;

public class turingMachine {

	private ArrayList<String[]> transicoes;
	private String[] stringInput;
	private int pointer = 0;
	private String currentState = "0";


	public void runFullSpeed() {

		int count = 0;
		while(!currentState.equals("A") && !currentState.equals("R")){
		//while(count < 7){

			String[] function = getCurrentFunction(currentState, stringInput[pointer]);
			//System.out.println(function);

			//Escreve
			stringInput[this.pointer] = function[2];

			//Anda
			if(function[3].equals("R")){
				this.pointer += 1;
			}else if(function[3].equals("L")){
				this.pointer -= 1;
			}

			//Muda de estado
			setCurrentState(function[4]);


			count += 1;
			System.out.println(currentState);

		}

		if(currentState.equals("A")){
			System.out.print("Aceito");
		}else{
			System.out.print("Rejeito");
		}

		
	}

	public void stepByStep() {
		// TODO Auto-generated method stub
		
	}

	public void changeWord(String word) {
		
	}

	public void end() {
		// TODO Auto-generated method stub
		
	}

	public String currentState() {
		// TODO Auto-generated method stub
		return null;
	}

	public String steps() {
		// TODO Auto-generated method stub
		return null;
	}


	public int getPointer() {
		return pointer;
	}

	public void setPointer(int pointer) {
		this.pointer = pointer;
	}

	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

	public String[] getCurrentFunction(String state, String read){

		for(int i=0; i < transicoes.size(); i++){
			String[] currentFunction = transicoes.get(i);
			if(currentFunction[0].equals(state) && currentFunction[1].equals(read)){
				return currentFunction;
			}
		}

		return null;
	}

	public void setStringInput(String[] stringInput){
		this.stringInput = stringInput;
	}

	public void setTransicoes(ArrayList<String[]> transicoes){
		this.transicoes = transicoes;
	}

	public void moveToRigth(){
		this.pointer += 1;
	}

	public void moveToLeft(){
		this.pointer -= 1;
	}
}
