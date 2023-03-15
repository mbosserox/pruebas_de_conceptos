

public class MainBigestPalindrom {

    public static String longestPalindrome(String s) {
        int maxLength = -1 ;
        String biggesPalindrome = "";
        for(int i = 0 ; i <s.length();i++){
            if((s.length()-i)>maxLength){
                for (int j = s.length(); j >i; j--) {
                    String aux = s.substring(i,j);
                    if(isPalindrome(aux)){
                        if(aux.length()>maxLength){
                            System.out.println("ENCOTRADO PALINDROMO"+aux);
                            biggesPalindrome=aux;
                            maxLength = aux.length();
                            break;
                        }
                    }
                }
            }
        }
        return biggesPalindrome;
    }
    public static boolean isPalindrome(String s){

        StringBuilder sb = new StringBuilder(s.substring(s.length()-s.length()/2));
        return (s.substring(0,s.length()/2).equals(sb.reverse().toString()));
    }
    public static void main(String[] args) {
        longestPalindrome("123456");
    }

}
