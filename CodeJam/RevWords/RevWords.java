//James Roesemann
//codejam
//reverse words

import java.util.*;
import java.io.*;

public class RevWords{
	public static void main(String[] args){
		RevWords Go = new RevWords();
		Go.go();
	}

	void go(){
		//reads in the file
		File inFile = new File("reverse_words.in");
		//throws exception if file not found
		try{
			//creates a scanner to read each line, the number of lines, an empty stack and reads in the first line.
			Scanner readIn = new Scanner(inFile);
			int numOfLines = readIn.nextInt();
			Stack currentLineStack = new Stack();
			readIn.nextLine();
	
			//reads through the whole text doc and outputs the correct data each repitition.	
			for(int i=0; i<numOfLines; i++){
				currentLineStack = BuildStack(readIn.nextLine());
				printOutput(currentLineStack, i+1);	
			}
		}
		//if a file not found exception, close the program
		catch(FileNotFoundException e){
			System.exit(-1);
		}
	}
	//reads in each token from the given line and puts it on a stack
	Stack BuildStack(String currentLine){
		Scanner readLine = new Scanner(currentLine);
		Stack revOrder = new Stack();
		while(readLine.hasNext()){
			revOrder.push(readLine.next());
		}
		return revOrder;
	}
	//given a stack and an int, will print the correct output. rember to add one to line to get the correct line number.
	void printOutput( Stack currentStack, int lineNum){
		System.out.print("Case #"+lineNum+": ");
		while(currentStack.empty()==false){
			System.out.print(currentStack.pop()+" ");
		}
		System.out.println("");
	}
}
		
