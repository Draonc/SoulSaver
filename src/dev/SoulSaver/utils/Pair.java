package dev.SoulSaver.utils;


//Class is used to store the information needed in the tile class
public class Pair <A,B> {
		A first = null;
	    B second = null;
	    B third = null;
	    B fourth = null;
	    B fifth = null;

	    public Pair(A first, B second, B third, B fourth, B fifth) {
	        this.first = first;
	        this.second = second;
	        this.third = third;
	        this.fourth = fourth;
	        this.fifth = fifth;
	    }

	    public A getFirst() {
	        return first;
	    }

	    public void setFirst(A first) {
	        this.first = first;
	    }

	    public B getSecond() {
	        return second;
	    }

	    public void setSecond(B second) {
	        this.second = second;
	    }
	    
	    public B getThird(){
	    	return third;
	    }
	    
	    public void setThird(B third){
	    	this.third = third;
	    }
	    
	    public B getFourth(){
	    	return fourth;
	    }
	    
	    public void setFourth(B fourth){
	    	this.fourth = fourth;
	    }
	    
	    public B getFifth(){
	    	return fifth;
	    }
	    
	    public void setFifth(B fifth){
	    	this.fifth = fifth;
	    }

}
