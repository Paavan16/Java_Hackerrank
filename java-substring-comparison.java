

    public static String getSmallestAndLargest(String s, int k) {
       
        String seq=s.substring(0,k);
         String smallest = seq;
        String largest = seq;
        for(int i=0;i<=s.length()-k;i++)
        {
            seq=s.substring(i,i+k);
            if(seq.compareTo(smallest)<0)
            smallest=seq;
            if(seq.compareTo(largest)>0)
            largest=seq;
        }
        
        
        
        
        
        return smallest + "\n" + largest;
    }

