public class CountTheCharacterAndNumber {
    public static void main(String[] args) {
        String a="rakeshbaghele12345678";
      int countalpha=0;
      int countdigit=0;
      char[] b=a.toCharArray();
      for (int i=0;i<a.length();i++){
          boolean ans=Character.isAlphabetic(b[i]);
          if (ans==true){
              countalpha++;

          }else
              countdigit++;
      }
        System.out.println("count of alphabets"+countalpha);
        System.out.println("count of digit"+countdigit);

    }}