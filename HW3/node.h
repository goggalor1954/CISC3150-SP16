#ifndef NODETEST
#define NODETEST

template <typename T>
class Node{
	public:
	T nodeValue;
	Node<T> *next;
	Node (const T& item, Node<T> *ptr = NULL): nodeValue(item), next(ptr) {}
};

#endif
