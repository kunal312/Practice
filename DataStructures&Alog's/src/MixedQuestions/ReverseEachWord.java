package MixedQuestions;

/**
 * Created by kunal on 3/29/18.
 */
public class ReverseEachWord {

    public String reverseString(String [] str){
        if(str.length==0) return "";
        StringBuilder fStr =  new StringBuilder();
        for(int i=0;i<str.length;i++){
            String s = reverseEach(str[i]);
            fStr.append(s);
            if(i!=str.length-1)
                fStr.append(" ");
        }
        return fStr.toString();
    }

    private String reverseEach(String str){

        char []ch = str.toCharArray();
        int start = 0;
        int end = ch.length;
        while(start<end){
            char tmp = ch[start];
            ch[start] = ch[end-1];
            ch[end-1]=tmp;
            start++;
            end--;
        }

        return String.valueOf(ch);
        //return new String(ch);

    }
    public static void main(String[] args) {

        String[] str = {"Hello", "World"};
        ReverseEachWord t = new ReverseEachWord();
        String s = t.reverseString(str);
        System.out.println(s);
        System.out.println(s.length());



    }

}
