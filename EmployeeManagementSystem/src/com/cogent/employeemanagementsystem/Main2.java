package com.cogent.employeemanagementsystem;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="cogent university";
		//System.out.println(s.length());
		//length method: string class
		//length property is: array
		
		StringBuffer buffer= new StringBuffer("asdfqwerwqer");
		StringBuffer buffer1= new StringBuffer("asdfqwe");
		System.out.println(buffer.delete(0, 5));
	
		//System.out.println(	buffer.compareTo(buffer));
		
//		//Dc(default constructor): by default it is capable to hold 
//		//16 chars
//		//put chars==> capacity = chars+16
//		//put number ===> capacity = number
//		buffer.append("ShaotongChen");
//		// 12 chars
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
//		System.out.println();
//		buffer.append("...");
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
//		System.out.println();
//		
//		buffer.append("+");
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
//		buffer.append("sd");
//		System.out.println();
//		
//		System.out.println(buffer.capacity());
//		System.out.println(buffer.length());
//		
//		System.out.println();
//		System.out.println(buffer.toString());
//		
	
		
		
		
		
		/*	String result =s.substring(0,6);
		System.out.println(result);
		System.out.println(s.equals("cogent university"));
		System.out.println(s=="cogent university");
		System.out.println(s==new String ("cogent university"));
		//it is used to check that whether s and others 
		// reference is refering to same object or not(compare the address)
		//equals method used to check the content
		//== operator is used to check location in case of ref
		//in case of primitive ==> value would be the exception
		
		System.out.println("abi".codePointAt(0));
		System.out.println("ABI".codePointAt(0));
		System.out.println("abiDD".compareTo("abi"));
		System.out.println("a".compareTo("a"));
		System.out.println("b".compareTo("D"));
		
		
		
		
		
		
		
		
		
		
		
		/*
		//ip:192.168.1.1
		String ip= "192.168.1.1";
		//IP Address type : A B C D E
		//do we need to split this ip address on the 
		//basis of .?
		//0 ==>255  
		String [] ipAddress = ip.split("\\.");
		// \\.===> \.
		// \. is escape sequence
		System.out.println("\\.");
		try {
			for (String string : ipAddress) {
				
				int i= Integer.parseInt(string);
				if(i>=0 && i<=255) {
					System.out.println(i);
					
				}else
					System.exit(0);
			}
			int clasCell=Integer.parseInt( ipAddress[0]);
			
			if(clasCell>0 &&clasCell<=126) {
				System.out.println("Ip belongs to A");
			}else if(clasCell>127 &&clasCell<=191) {
				System.out.println("Ip belongs to b");
			}else if(clasCell>191 &&clasCell<=223) {
				System.out.println("Ip belongs to c");
			}else if(clasCell>223 &&clasCell<=239) 
				System.out.println("Ip belongs to d");
			else System.out.println("Ip belongs to f");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	/*	String s="ShaotongChen";
		String s2="cogent";
		String s3= new String("cogent university");
//CLASSNAME   REF= Runtime allocation
		String s4="ShaotongChen";
		String s5="cogent";
		//s4 and s point to same address.
		//s5 and s2 point to same address.
		System.out.println(s4.concat(" "+s5));
		//concate is the only one solction where
		//we can get new object
		System.out.println(s4);
		//becoz string objects immutable
		
		//at least 3-4 methods except concat
		//toUpperCase, toLowerCase(), ValueOf
		//replace?
		//which are returning new String objects
		 * 
		 * */
		 
	}

}
