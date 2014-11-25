
public class ReverseInteger {
	public int reverse(int x) {
		String flag = "";
		if (x < 0) {
			flag = "-";
			x = -x;
		}
		String source = x+"";
		int i, len = source.length();
	    StringBuffer dest = new StringBuffer(len);

	    for (i = (len - 1); i >= 0; i--)
	      dest.append(source.charAt(i));
	    return Integer.parseInt(flag+dest.toString());
        
    }
}
