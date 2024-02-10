public class stringcompression {
    public String compressString(String s) {
       if(s.isEmpty() || s==null)
       {
    	   return s;
       }
       StringBuilder compresstr = new StringBuilder();
       int count=1;
       char charcur=s.charAt(0);
       for(int i=0;i<s.length();i++)
       {
    	   if(s.charAt(i)==charcur)
    	   {
    		   count++;
    	   }
    	   else {
    		   compresstr.append(charcur).append(count);
    		   charcur =s.charAt(i);
    		   count =1;
    	   }
       }
       compresstr.append(charcur).append(count);
       return compresstr.length() < s.length() ? compresstr.toString() : s;
    }
    
    public static void main(String[] args) {
        stringcompression strCompressor = new stringcompression();
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        String compressedString =strCompressor.compressString(str);
        System.out.println(compressedString);
        sc.close();
    }
}