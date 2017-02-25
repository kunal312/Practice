package MixedQuestions;

/**
 * Created by kunal on 2/24/17.
 */
public class CompareVersionNumber {

        public int compareVersion(String version1, String version2) {

            String [] str1 = version1.split("\\.");
            String [] str2 = version2.split("\\.");

            System.out.println("String 1 lenght:"+str1.length);

            System.out.println("String 2 lengttg:"+str2.length);


            for(int i =0;i<str1.length;i++)
            {
                System.out.print("String 1:"+str1[i]);
                for(int j =0;j<str2.length;j++){
                    if(Integer.parseInt(str1[i])<Integer.parseInt(str2[j])){
                        return -1;
                    }
                    else if(Integer.parseInt(str1[i])>Integer.parseInt(str2[j])){
                        return 1;
                    }
                }
            }
            return 0;

        }

        public static void main(String[] args){

            CompareVersionNumber cmp = new CompareVersionNumber();
            cmp.compareVersion("1.1","0.1");
        }



    }

