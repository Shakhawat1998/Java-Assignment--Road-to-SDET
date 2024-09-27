public class removeVowelsFromAString{
    public static void main(String[] args) {
        String s = "I am a SQA Engineer";
        String s1 = s.toLowerCase();
        String sv = "aeiou";
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);
            if (sv.indexOf(currentChar) == -1) {
                s2.append(currentChar);

            }
        }
        String str = s2.toString();
        char[] chars= str.toCharArray();

        for(int i=0;i<chars.length;i++){
            if(chars[i]==' ' && chars[i+1] ==' '){
                continue;
            }
            else
                System.out.print(chars[i]);
        }
    }
}
