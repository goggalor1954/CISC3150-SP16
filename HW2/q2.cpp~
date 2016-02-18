template <typename T>	
T listZero(std::list<T>& numList){		
	int largeNum, smallNum;
	for(std::list<T>::iterator iter=numList.begin(); iter != numList.end(); iter++){
		if(largeNum==NULL){
			largeNum=*iter;
			smallNum=*iter;
		}
		else{
			if(*iter>largeNum) largeNum=*iter;
			if(*iter<smallNum) smallNum=*iter;
		} 
	}
	std::list<T> bigSmallList;
	bigSmallList.push_back(largeNum);
	bigSmallList.push_back(smallNum);
	return bigSmallList;
}		
	
