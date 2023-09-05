public class HiddenWord {
    private String hiddenWord;

    public HiddenWord(String h) {

        h = h.toUpperCase();
        hiddenWord = h;
    }

    public String getHiddenWord(){
        return hiddenWord;
    }

    public String getHint(String x) {
        if (!(x.equals(x.toUpperCase()))) {
            throw new IllegalArgumentException("Your guess ( "+x+" ) does not contain all uppercase letters. Your guess must contain all uppercase letters!");
        }
        if (x.length() != hiddenWord.length()) {
            throw new IllegalArgumentException("Your guess ( "+x+" ) has 7 characters. The hidden word has 9 characters. Your guess must be a word with 9 characters!");
        }
        String hint = "";

        for(int i = 0; i < x.length(); i++){
            if (x.charAt(i)== hiddenWord.charAt(i)) {
                hint += x.charAt(i);
            }
            else if(hiddenWord.indexOf(x.charAt(i) )!= -1)
                hint+= "+";
            else
                hint += "*";
        }
        return hint;
    }
}



