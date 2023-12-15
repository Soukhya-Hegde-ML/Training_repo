public class StringsDemo {
    public static void main(String ar[])
    {
        String s="Maplelabs ";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);
        System.out.println(s.trim());//removes white space
        System.out.println(s.startsWith("Ma"));
        System.out.println(s.endsWith("s"));
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        String replaceString=s.replace("Labs","Leaves");
        System.out.println(replaceString);
        //Stringbuffer class
        StringBuffer sb=new StringBuffer("Welcome ");
        sb.append(" maplelabs");
        System.out.println(sb);
        sb.insert(8,"To");
        System.out.println(sb);
        sb.delete(8,10);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //string builder
        StringBuilder sbuild=new StringBuilder("Hello ");
        sbuild.delete(1,3);

    }

}
