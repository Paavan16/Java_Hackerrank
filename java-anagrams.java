

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char A[]=a.toLowerCase().toCharArray();
        char B[]=b.toLowerCase().toCharArray();
        if(a.length()!=b.length())
        return false;
        else
        {
            java.util.Arrays.sort(A);
            java.util.Arrays.sort(B);
            return java.util.Arrays.equals(A,B);
        }
    }

