package Project1;

public class T10 {
    public static void main(String[] args) {
        String[] words={"Artem", "Den","Aaren","Lilith","Din","lena","Lilith"};
        for (int i=0;i<words.length;i++){
            for (int j=i+1;j< words.length;j++){
                if (words[i]==words[j]){
                    System.out.println("Duplicate word in the array is "+ words[j]);
                }
            }
        }
    }
}
