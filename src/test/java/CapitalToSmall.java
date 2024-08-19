public class CapitalToSmall {
    public static void main(String[] args) {


String a="Rakesh Baghele";
StringBuffer alpha=new StringBuffer(a);
for (int i=0;i<a.length();i++){
    if (Character.isLowerCase(a.charAt(i))){
        alpha.setCharAt(i,Character.toUpperCase(a.charAt(i)));
    }else if (Character.isUpperCase(a.charAt(i))){
        alpha.setCharAt(i,Character.toLowerCase(a.charAt(i)));
    }}
    System.out.println(alpha);
}


}
