package org.inetsolv;

//THIS IS THE PROGRAM FOR FINDING ALL SMALL AND BIG ALPHABETS.....
public class Alphabets {

	public static void main(String[] args) {
	
		System.out.print("THE SMALL LETTERS ARE :");
		for(char smallLetters='a';smallLetters<='z';smallLetters++) {
			System.out.print(smallLetters+",");
		}

		System.out.println();
		System.out.print("THE BIG LETTERS ARE :");
		for(char smallLetters='A';smallLetters<='Z';smallLetters++) {
			System.out.print(smallLetters+",");
		}
	}

}
/*
THE SMALL LETTERS ARE :a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
THE BIG LETTERS ARE :A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
*/