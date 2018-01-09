package com.codify.guidewire;

public class ExerciseTwo {


    public static int solution(int[] A) {
        int N = A.length;
        int result = 0;
        
        //int mediana = N/2;
       
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                if (A[i] == A[j])
                    result = Math.max(result, Math.abs(i - j));
            }
        return result;
    }
    
    public static int solution2(int[] A) {
        int N = A.length;
        int result = 0;
        
        int mediana = N/2;
       
        for (int i = 0; i < mediana; i++)
            for (int j = 0; j < N; j++) {
                if (A[i] == A[j])
                    result = Math.max(result, Math.abs(i - j));
                if (A[mediana + i] == A[j])
                	result = Math.max(result, Math.abs((mediana + i) - (j)));
            }
        return result;
    }
    
    public static int solution3(int[] A) {
        int N = A.length;
        int result = 0;
        
        int quarter = N/4;
       
        for (int i = 0; i < quarter; i++)
            for (int j = 0; j < N; j++) {
                if (A[i] == A[j])
                    result = Math.max(result, Math.abs(i - j));

                if (A[quarter + i] == A[j])
                	result = Math.max(result, Math.abs((quarter + i) - (j)));
                
                if (A[(quarter*2) + i] == A[j])
                	result = Math.max(result, Math.abs(((quarter*2) + i) - (j)));
                
                if (A[(quarter*3) + i] == A[j])
                	result = Math.max(result, Math.abs(((quarter*3) + i) - (j)));                  
            }
        return result;
    }

}
