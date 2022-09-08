package StringMethods;

public class TwoStringMethods {
    public static void main(String[] args) {
        //string literal
//        String a = "hello.";
//        String b = "hello.";
//        if(a==b){
//            System.out.println("same");
//        }else{
//            System.out.println("not same");
//        }

        //by new keyword
//        String s1 = new String("Welcome");
//        String s2 = new String("welcome");
//        if(s1==s2){
//            System.out.println("same");
//        }else{
//            System.out.println("different");
//        }

        //String(byte[] bytes)
//        byte[] bytes = {100,101,102};
//        String str = new String(bytes);
//        System.out.println(str);
        // String(char[] chars)
//        char chars[] = {'M','a','s','a','i'};
//        String s = new String(chars);
//        System.out.println(s);
        //String(StringBuffer sbuffer)
//        StringBuffer sbuffer = new StringBuffer("Masai");
//        String vu = new String(sbuffer);
//        System.out.println(vu);
        // String(StringBuilder sbuilder)
//        StringBuilder sbuilt = new StringBuilder("Masai");
//        String cu = new String(sbuilt);
//        System.out.println(cu);
//        String kurl = "interstaller";
//        String musk = "intestaller";
//        System.out.println(musk.length());
//        System.out.println(musk.charAt(7));
//        System.out.println(musk.substring(1,5));
//        System.out.println(musk.substring(4));
//        System.out.println(musk.concat("_helloBrother"));
//        System.out.println(musk.indexOf("t"));
//        System.out.println(musk.indexOf("t",3));
//        System.out.println(musk.lastIndexOf("l"));
//        System.out.println(musk.equals(kurl));
//        System.out.println(musk.replace("t","k"));
//        System.out.println(musk.toCharArray());
        //strings are immutable
//        String message = "Welcome";
//        message.concat("_user");
//        System.out.println(message);//Welcome
//        String message = "Welcome";
//        String newMessage = message.concat("_user");
//        System.out.println(newMessage);
//        System.out.println(message);
//        StringBuilder strbuilt = new StringBuilder("start");
//        strbuilt.append("_user>system_cross");
//        System.out.println(strbuilt);
//        StringBuilder strs = new StringBuilder("Welcome john cena");
//        strs.reverse();
//        System.out.println(strs);
        String s1 = "sachin";
        String s2 = "sachin";
        String s3 = "ratanhussain";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
    }
}
