package chapter9;

import java.util.*;

public class Arrayinclasses {


	 public static int maxLength(ArrayList<String> list) {
         int max = 0;
         for (int i = 0; i < list.size(); i++) {
             String s = list.get(i);
             if (s.length() > max) {
                 max = s.length();
             }
         }
         return max;
     }


	}


