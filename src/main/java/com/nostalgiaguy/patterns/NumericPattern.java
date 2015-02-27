//******************************************************

package com.nostalgiaguy.patterns;
public class NumericPattern {
	public static String parseNum=""; 
	
	public static int parseNum(int num){
		
		int number=num;
		int cache=number;
		int length = String.valueOf(number).length();	
		int arr[]=new int[length];
		int index=length-1;
		while(number>0){
            int remainder=number%10;
            arr[index]=remainder;
            number=number/10;
            index--;
        }		
		 for(int i1=0; i1<length; i1++){
	           // System.out.println(a[i1]);
	        }
		//System.out.println("length="+length);
		int bitCount=1;
		for(int count=0;count<length-1;count++){
			if(arr[count]==arr[count+1]){
				bitCount++;
			}
			else{
				break;
			}
		}
		//System.out.println("count="+count);
		//System.out.println(cache%(int)Math.pow(10, length-count));
		int rev=cache%(int)Math.pow(10, length-bitCount);
		//System.out.println(rev);
		//System.out.println(count+""+a[0]);
		String s=String.valueOf(bitCount+""+arr[0]);
		parseNum=parseNum+s;
		return rev;
		
	}

	public static void main(String[] args) {
		
		int read=1;
		while(read<1000000000){
		System.out.println("Tread="+read);
		int sum=parseNum(read);
		while(sum!=0){
			int sum1=parseNum(sum);
			sum=sum1;
		}
		System.out.println("Tparse="+parseNum);
		int num=Integer.parseInt(parseNum);
		read=num;
		parseNum="";
		}
		
	}
}
