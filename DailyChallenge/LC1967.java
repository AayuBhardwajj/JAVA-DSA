package DailyChallenge;
public class LC1967{
    public static void main(String[] args){
        String[] patterns={"a","ab","abc","bc","d"};
        String word="abc";
        CheckWhetherThePatternElementsAppearAsSubstringOfWords(patterns, word);
    }
    public static void CheckWhetherThePatternElementsAppearAsSubstringOfWords(String[] patterns, String word){
        int count=0;
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}