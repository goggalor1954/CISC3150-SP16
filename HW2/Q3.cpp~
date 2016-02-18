#include<iostream>

void pasTri(int rowVal);
int main(){
	int rowVal;
	std::cin >> rowVal;
	pasTri(rowVal);

	return 0;
}
void pasTri(int rowVal){
	int numVal;
	for(int i=0; i<rowVal; i++){
		numVal=1;
		for(int j=0; j<=i; j++){
			std::cout <<" " << numVal;
			numVal=numVal*(i-j)/(j+1);
		}
		std::cout << std::endl;
	}
}
