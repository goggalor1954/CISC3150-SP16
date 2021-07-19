//James roesemann
//Assignment 6 Question 1
//rembember, i just need to write the function, not the whole program, this is just for testing needs to return a list of sets (a list object cotaining  diffrent sets)
import java.util.*;

public class nSet{
	public static void main(String [] args){
		nSet Go = new StoreCredit();
		Go.go();
	}
	public void go(){
		
		//need to iterate through the set . needs to be recursive.
	}
	
	//recursive function that will iterate through the set, returning all the sets of i given size given a the set and size.
}	List nSetList(Set givenSet, int nElements){
		if(nElements<=0) return;
		if(nEelements > givenSet.size()) return;
		//need to put the recursive function here, also create the iterator. needs to return a set
	}
	Set setMaker( Set givenSet, Iterator currentPos,){
		if(currentPos.hasNext()==false) return;
		
	}
}



//thinking .... i need to return the current element in set + every other element in the set untill the end...maybe this dosent need to be a seprate function. i need to overload the function, one for the base, one with an iterator. the iterator 
// the iterator will functuion will the the position of the first element allowed( unless i can pass a shortend list, think about that later) and then add all the sets untill the end. the recursivly call the function one iterator
//position ahead untill done. i should return sets, so that if the number is greater than 2 it ads two sets. shaould also set it up so that it returns one element in the case of a list of single sets. 
//maybe it would be easier to pass the new list and add as i go along
//maye i create sets of one size, and add sets together untill they are the correct sze. would only need to create set with half the elemsnts
//


// new approach, compute all the subsets of size k form pos 2 to k. then compute all the k-1 subsets from 2 onwards.  asdd 1 to the later. and add the sets together. i have to create 2 sets of sets. then add the first eleemnt to the second one. then merge the sets. 