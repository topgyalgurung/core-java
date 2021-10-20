public class StringPool{
    public static void main(String[] args) {
        String s1="Rachel";
        String s2="Rachel";
        System.out.println(s1==s2);

        String s3=new String("Rachel");
        String s4=new String("Rachel");
        System.out.println(s3==s4);
    }
}