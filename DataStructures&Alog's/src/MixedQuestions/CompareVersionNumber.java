package MixedQuestions;

import java.util.IntSummaryStatistics;

/**
 * Created by kunal on 2/24/17.
 */
public class CompareVersionNumber {

        public int compareVersion(String version1, String version2) {

            String [] str1 = version1.split("\\.");
            String [] str2 = version2.split("\\.");

            int maxLength=Math.max(str1.length,str2.length);

            for(int i =0;i<maxLength;i++){

                Integer v1,v2=0;

                if(i<str1.length){
                    v1 = Integer.parseInt(str1[i]);
                }
                else{
                    v1=0;

                }

                if(i<str2.length){
                    v2= Integer.parseInt(str2[i]);

                }else{
                    v2=0;
                }

                int compare = v1.compareTo(v2);

                if(compare!=0)
                    return compare;
            }

            return 0;



        }

        public static void main(String[] args){

            CompareVersionNumber cmp = new CompareVersionNumber();
            System.out.println(cmp.compareVersion("1.1","0.1"));
            System.out.println(cmp.compareVersion("01","1"));
            System.out.println(cmp.compareVersion("1.1","1.01.0"));
        }



    }

