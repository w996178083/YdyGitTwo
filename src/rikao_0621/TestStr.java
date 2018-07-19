package rikao_0621;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//test rikao_0621 test03   0000.3
public class TestStr {
   public static void main(String[] args) {
	  String subStr ="北京市人民政府和北京市政协";
	  String str="北京";
	  Pattern compile = Pattern.compile(str);
	  Matcher matcher = compile.matcher(subStr);
	  int found=0;
	  while(matcher.find()) {
		  found++;
	  }
	  System.out.println(found);
}
}
