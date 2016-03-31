//need ot input the text file
//first line is the number of cases, all foloowing lines pertain to individual cases
//per case
//first line is the ammount of credit
//next line is a series of diffrently priced items
//iterrate through the items untill you find two that add together to equal the crerdit, there will only be one pair
//output the first item# and the second item number



import java.util.*;
import java.io.*;

public class StoreCredit{
	public static void main(String[] args){
		StoreCredit Go = new StoreCredit();
		Go.go();
	}
	void go(){
		File inFile = new File("A-small-practice.in");	
		try{
			//creates a scanner to read each line, the number of cases, an empty stack and reads in the first line.
			Scanner readIn = new Scanner(inFile);
			int numOfCases = readIn.nextInt();
			int currentCredit;
			int currentNumOfItems;
			int holder;
			LinkedList currentItems = new LinkedList();
			readIn.nextLine();

			//loop to repeat the process
			for(int i=0; i<numOfCases; i++){
				currentCredit=readIn.nextInt();
				currentNumOfItems=readIn.nextInt();
				//System.out.println(currentCredit+" "+currentNumOfItems);
				//readIn.nextLine();
				//I ran into this wierd error where nextLine would not pass the first token of the next line, couldnt figure out why so i ended up having to pass this concatinated line.
				holder=readIn.nextInt();
				currentItems=BuildList(holder+readIn.nextLine());
				System.out.print("Case #"+ (i+1) +" ");
				PrintItems(currentItems, currentCredit);
			}
		}
		catch(FileNotFoundException e){
			System.exit(-1);
		}
			
	}
							
	//given a string, creates a list of diffrently priced items (might have to change each token to an int)
	
	LinkedList BuildList(String items){
		Scanner readItems = new Scanner(items);
		LinkedList currentItems = new LinkedList();
		while(readItems.hasNextInt()){
			currentItems.add(readItems.nextInt());
		}
		return currentItems;
	} 
	//find and print the 2 item values that equal the credit.
	
/*
	void printItems(LinkedList items, int credit){
		ListIterator<Integer> firstPos=items.listIterator();
		ListIterator<Integer> secondPos=items.listIterator();
		secondPos.next();
		while(firstPos.hasNext()){
			while(secondPos.hasNext()){
			//testing 	System.out.println("testing"+firstPos.next()+" "+secondPos.next());
				if(firstPos.next()+secondPos.next()==credit){
					System.out.println(firstPos.next()+" "+secondPos.next());
					return;
				}
				System.out.println(secondPos.next());				
//				secondPos.next();
			}
			firstPos.next();
		}
	}*/

	void PrintItems(LinkedList items, int credit){
		for(int i=0; i<items.size(); i++){
			for(int j=1; j<items.size(); j++){
				if(items.get(i)+items.get(j)==credit){
					System.out.println(items.get(i)+" "+items.get(j));
					return;
				}
			}
		}
	}
					
}	
