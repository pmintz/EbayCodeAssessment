package assessment;

import java.util.*;

public class CodeAssessment {

    public static void main(String[] args){

        CodeAssessment ca = new CodeAssessment();
        ca.test();


    }

    void solution(int n) {
        String num = Integer.toString(n);
        char [] charArray = num.toCharArray();
        int sum = 0;
        for(char c: charArray)
            sum += Character.getNumericValue(c);
        System.out.println(sum);

    }

    boolean solution(String time) {

        String [] hhmm = time.split(":");
        int hh = Integer.parseInt(hhmm[0]);
        int mm = Integer.parseInt(hhmm[1]);

        if(hh>=0 && hh<=12 && mm>=0 && mm<=59 )
            return true;
        else return false;

    }

    boolean solution(int[] sequence) {

        int count = 0;
        int position = 0;
        List<Integer> sequenceList = new ArrayList();

        Set<Integer> dups = new HashSet<>();
        for (Integer i : sequence) {
            dups.add(i);
        }
        System.out.println(dups.size());


        for(int x = 0, y =1; y<sequence.length; x++,y++){
            if(sequence[x]> sequence[y])
                count++;
                position = x;

        }



        if(count<=1 && dups.size() == sequence.length){
            for (Integer i : sequence) {
                sequenceList.add(i);
            }
            //sequenceList.remove(position);
        }else return false;

      /*  for(int t : sequenceList){
            System.out.println(t);
        }*/
     /*       return true;
        } else {
            return false;
        }*/

        for(int a = 0; a < sequenceList.size(); a++) {
            for (int b = a + 1; b < sequenceList.size(); b++) {
                if (a > b)
                    return false;
            }
        }
        return true;

    }

    void test(){

        solution(new int[]{1, 3, 2,1});

    }
}
