#include <iostream>
#include <cstdlib>
#include <stack>
using namespace std;

class rPolishN{
	private:
		char rPolishSign;
		int rPolishNum;
	public:
		void setRPolishSign( char rPChar)[
		char getRPolishSign( void);
		void setRPolishNum( int rPNum);
		int getRPolishNum( void);
		//i mught not need those setters if i write it like this.
		rPolishN(char rPChar);
		rPolishN(int rPNum);
} 
	//here i have to put constructors for this 
void rPolishN::setRPolishSign( char rPChar){
	rPolishSign=rPChar;
}
void rPolishN::setRPolishNum(int rPNum){
	rPolishNum=rPNum;
}
char rPolishN::getPolishSign(void){
	return rPolishSign;
}
int rPolishN::getPolishSign(void){
	return rPolishNum;
}
//again, might be able to get away with these
rPolishN::rPolishN(char rPChar){
	rPolishSign=rPChar;
}
rPolishN::rPolishN(int rPNum){
	rPolishNum=rPNum;
}





int main(){

//creating a stack
	stack<rPolishN> rPStack;
	while (!cin.eof()){
		rPStack.push(cin.getline());
		//if cin is the wrong type, orany character that it not + or *
		if(cin.fail() || cin.getLine()<'*' || cin.getLine()>'+'  ){
			cout<< "you entered something wrong" << endl;
			//put the thing to kill the program here
		}
	}
	//now we have the stack. write the recursive fuction to process it.
		

}
//recursive rpolish function
// becaulse i nbeed to bive priority to muliplcation im writeing two functions. one for muliplication and the other for addition. ill run one first then the other.
//i need to rember that i need to create a noter stack to store the current stack.
stack<rPolishN> rPMathMult(stack<rPolishN> rPStack);
	//if you reach the end of the stack
	if(rPStack.empty()==true) return rPStack;
	if(rPStack.getPoliSign() == '*'){
	//im not sure if i can even create anymous stacks.
		int first, second;
		rPStack.pop();
		first=rPStack.getPolishNum();
		rPStack.pop();
		second=rPStack.getPolishNum();
		rPStack.pop();
	//so what this should do is pushthe newley created mutiplied number onto the recursive stack.
		return rPMathMult(rPStack).push( rPolishN(first*scond));
	}
	// if the curent stack element is a number
	if(rPStack.getPolishSign() == NULL){
		int temp = rPStack.getPolishNum();
		rPStack.pop();
		//not sure if this is wriite.
		return rPMathMult( rPStack.push( rPolishN( temp)));
	}
	else{
		rpStack.pop();
		return rPMathMult( rPStack.push( rPolisN('+')));
	}
}

 //|| r.Pstack.getPolishSign() == '+'){
		
