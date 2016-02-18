template <typename T>	
int listZero(std::list<T>& numList){		
	int zeroCount = 0;
	for(std::list<T>::iterator iter=numList.begin(); iter != numList.end(); iter++){
		if(iter==0) zeroCOunt++;
	}return zeroCOunt;
}		
	
