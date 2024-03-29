package MixedQuestions;

import java.util.IntSummaryStatistics;

/**
 * Created by kunal on 2/24/17.
 165. Compare Version Numbers
 * Compare two version numbers version1 and version2.
 If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

 You may assume that the version strings are non-empty and contain only digits and the . character.
 The . character does not represent a decimal point and is used to separate number sequences.
 For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

 Here is an example of version numbers ordering:

 0.1 < 1.1 < 1.2 < 13.37
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

