public class ReverseAString {

    public static void  main(String[] args){
        String reversed=reverse("abbcabbc");
        System.out.println(reversed);
    }
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
}
