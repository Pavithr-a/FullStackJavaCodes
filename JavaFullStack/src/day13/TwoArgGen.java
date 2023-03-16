package day13;

public class TwoArgGen<T,V> {

	T tObj;
	V vObj;
	
	TwoArgGen(T to,V vo) {
		tObj=to;
		vObj=vo;
	}
	
	void ShowTypes() {
		System.out.println("Type of T is "+tObj.getClass().getName());
		System.out.println("Type of V is "+vObj.getClass().getName());
	}
	
	T getTObj() {
		return tObj;
	}
	
	V getVObj() {
		return vObj;
	}
}
