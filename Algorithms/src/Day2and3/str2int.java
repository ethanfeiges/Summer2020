package Day2and3;

public class str2int
{
	 public static void main(String[] args){
	        String number = "1023";
	        System.out.println(StrNumToInt(number));
	    }
	    private static int StrNumToInt(String number){
	        if(number.length() == 0) return 0;
	        if(number.charAt(0) == '-') return -StrNumToInt(number.substring(1));
	        int value = number.charAt(0) - '0';
	        return (int) (value * Math.pow(10, number.length() - 1)) + StrNumToInt(number.substring(1));
	    }

}
