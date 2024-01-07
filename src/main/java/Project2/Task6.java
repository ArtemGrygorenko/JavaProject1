package Project2;

public class Task6 {
    public static void main(String[] args) {
        String string = "documentation";
        int countVowels=count(string);
        System.out.println("vowels are present in a string 'documentation'= "+countVowels);
    }
    private static int count(String s){
        StringBuilder stringBuilder=new StringBuilder(s);
        int count=0;
        for (int i=0;i<stringBuilder.length();i++){
            char ch1=stringBuilder.charAt(i);

            if (ch1=='a'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='e'){
                count++;

            }
        }
        return count;
    }
}

