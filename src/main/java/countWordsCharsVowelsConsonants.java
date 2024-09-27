public class countWordsCharsVowelsConsonants {
    public static void main(String[] args) {
        String s = "I am a SQA Engineer";
        String s1 = s.toLowerCase();
        String s2="aeiou";
        int words=0,chars=0,vowel=0,consonent=0;
        for(int i=0;i<s1.length();i++) {
            if (s1.charAt(i) == ' ')
                words++;
            else
                chars++;
            if (s2.indexOf(s1.charAt(i)) != -1)
                vowel++;
            else if(s1.charAt(i) != ' ')
                consonent++;
        }
        words++;
        System.out.println("Words: "+words);
        System.out.println("Chars: "+chars);
        System.out.println("Vowel: "+vowel);
        System.out.println("Consonent: "+consonent);
    }
}
