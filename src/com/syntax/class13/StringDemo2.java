package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asdkj29840895fhkkshdk#$^*SD#$%*";
		
		System.out.println(str.replaceAll("[0-9]", "#")); //asdkj########fhkkshdk#$^*SD#$%*
		System.out.println(str.replaceAll("[a-z]", "#")); //#####29840895#########$^*SD#$%*
		System.out.println(str.replaceAll("[A-Z]", "#")); //asdkj29840895fhkkshdk#$^*###$%*
		System.out.println(str.replaceAll("[A-Za-z]", "#")); //#####29840895#########$^*###$%*
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#")); //######################$^*###$%*
		
		System.out.println(str.replaceAll("[^a-z]", "#")); //asdkj########fhkkshdk##########
		//  ^  -this means not 
		
		System.out.println(str.replaceAll("[^A-Z]", "#")); //#########################SD####
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "#")); //asdkj29840895fhkkshdk####SD####
		
		str="abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]", "#")); //######ghijkl

		str="asdkj29840895fhkkshdk#$^*SD#$%*\\";
		System.out.println(str.replaceAll("[A-z0-9]", "")); // "" -empty means remove  / A-z means all lowercase and uppercase
	}

}
