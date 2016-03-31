import java.util.*;
import java.io.*;

public class StoreCredit{
	public static void main(String[] args){
		StoreCredit Go = new StoreCredit();
		Go.go();
	}
	void go(){
		File inFile = new File("A-large-practice.in");	
		try{
			//creates a scanner to read each line, the number of cases, an empty stack and reads in the first line.
			Scanner readIn = new Scanner(inFile);
			int numOfCases = readIn.nextInt();
			int currentCredit;
			int currentNumOfItems;
			int holder;
			LinkedList<Integer> currentItems = new LinkedList<>();
			readIn.nextLine();

			//loop to repeat the process
			for(int i=0; i<numOfCases; i++){
				currentCredit=readIn.nextInt();
				currentNumOfItems=readIn.nextInt();

				//I ran into this wierd error where nextLine would not pass the first token of the next line, couldnt figure out why so i ended up having to pass this concatinated line.
				holder=readIn.nextInt();
				currentItems=BuildList(holder+readIn.nextLine());
				System.out.print("Case #"+ (i+1) +": ");
				PrintItems(currentItems, currentCredit);
			}
		}
		catch(FileNotFoundException e){
			System.exit(-1);
		}
			
	}
							
	//given a string, creates a list of diffrently priced items (might have to change each token to an int)
	
	LinkedList<Integer> BuildList(String items){
		Scanner readItems = new Scanner(items);
		LinkedList<Integer> currentItems = new LinkedList<>();
		while(readItems.hasNextInt()){
			currentItems.add(readItems.nextInt());
		}
		return currentItems;
	} 
	//find and print the 2 item values that equal the credit.

	void PrintItems(LinkedList<Integer> items, int credit){
		for(int i=0; i<items.size(); i++){
			for(int j=i+1; j<items.size(); j++){
				if(items.get(i)+items.get(j)==credit){
					System.out.println((i+1)+" "+(j+1));
					return;
				}
			}
		}
	}
					
}	
