package my.interview.questions;

public class PalinDrome {
	
	
	public static void main(String args[]){
		
	PalinDrome palinDrome = new PalinDrome();	
	palinDrome.isPalinDrome_Using_Reverse("abccba");
	palinDrome.isPalunDrome_Using_Array("abccba");
	}
	
	private void isPalinDrome_Using_Reverse(String str){
		String original=str; 
		String reverse="";
	      for ( int i = str.length() - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	}
	
	private void isPalunDrome_Using_Array(String str){
	    int length  = str.length();
	    int i, begin, end, middle;
	 
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	 
	    for (i = begin; i <= middle; i++) {
	      if (str.charAt(begin) == str.charAt(end)) {
			begin++;
			end--;
		  }
	      else {
		    break;
	      }
	    }
	    if (i == middle + 1) {
	      System.out.println("Palindrome");
	    }
	    else {
	      System.out.println("Not a palindrome");
	    } 
	}

}
