class charAt{
  public static void main(String[] args){
  String s1="Rohit Sharma ";
   System.out.println(s1.charAt(1));
   System.out.println( "length of the string: "+s1.length());
   System.out.println(s1.replace('S','s'));
   System.out.println(s1.toLowerCase());
   System.out.println(s1.toUpperCase());
   System.out.println(s1.trim());
   System.out.println(s1.indexOf('n'));
   System.out.println(s1.indexOf('a',8));
   System.out.println(s1.indexOf('a',9));
   System.out.println(s1.indexOf('a'));
   String substr="hit";
   System.out.println(s1.indexOf(substr));
   System.out.println(s1.indexOf(substr,3));
  }
}