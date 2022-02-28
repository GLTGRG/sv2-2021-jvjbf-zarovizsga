package sentences;

public class SentenceTransformer {

    public String shortenSentence(String sentence) {
        String result = sentence;
        if (validSentence(sentence)) {
            String[] words = sentence.split(" ");
            if (words.length >= 5) {
                result = words[0] + " ... " + words[words.length-1];
            }
        }
        return result;
    }


    private boolean validSentence(String sentence){
        char first = sentence.charAt(0);
        char last = sentence.charAt(sentence.length()-1);

        if (first < 'A' || first > 'Z') throw new IllegalArgumentException("Must start with capital letter!");
        if (last !='.' && last !='!' && last !='?') throw  new IllegalArgumentException("Must end with . ! or ?");

        return true;
    }
}
