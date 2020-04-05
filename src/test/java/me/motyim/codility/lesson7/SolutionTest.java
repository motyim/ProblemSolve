package me.motyim.codility.lesson7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void f1(){
        assertEquals(2, new Solution().solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
    }

    @Test
    public void f2(){
        assertEquals(3, new Solution().solution(new int[]{4, 3, 2, 1, 5, 8}, new int[]{0, 1, 0, 0, 0,1}));
    }

    @Test
    public void f3(){
        assertEquals(1, new Solution().solution(new int[]{4, 6, 2, 1, 5, 8}, new int[]{1, 1, 0, 0, 1,0}));
    }

    @Test
    public void f4(){
        assertEquals(0, new Solution().solution(new int[]{}, new int[]{}));
    }

    @Test
    public void f5(){
        assertEquals(3, new Solution().solution(new int[]{4,8,2}, new int[]{0,0,0}));
    }

    @Test
    public void f51(){
        assertEquals(3, new Solution().solution(new int[]{4,8,2}, new int[]{1,1,1}));
    }


    @Test
    public void f6(){
        assertEquals(1, new Solution().solution(new int[]{10,1,1,1}, new int[]{1,0,0,0,0}));
    }

    @Test
    public void f7(){
        assertEquals(4, new Solution().solution(new int[]{10,1,1,1}, new int[]{0,0,0,0,1}));
    }

    @Test
    public void f8(){
        assertEquals(2, new Solution().solution(new int[]{ 4, 3, 2, 1, 5  },new int[]{ 0, 1, 1, 0, 0 }));
    }

    @Test
    public void f9(){
        assertEquals(3, new Solution().solution(new int[]{ 4, 3, 2, 1, 5 },new int[]{ 1, 0, 1, 0, 1 }));
        assertEquals(2, new Solution().solution(new int[]{ 4, 3, 2, 0, 5  },new int[]{ 0, 1, 0, 0, 0 }));
        assertEquals(2, new Solution().solution(new int[]{ 4, 3, 2, 1, 5  },new int[]{ 0, 1, 0, 0, 0 }));

        assertEquals(2, new Solution().solution(new int[]{ 4, 3, 2, 5, 6  },new int[]{ 1, 0, 1, 0, 1 } ));
        assertEquals(3, new Solution().solution(new int[]{ 7, 4, 3, 2, 5, 6  },new int[]{ 0, 1, 1, 1, 0, 1 }));
        assertEquals(4, new Solution().solution(new int[]{ 3, 4, 2, 1, 5  },new int[]{ 1, 0, 0, 0, 0} ));
        assertEquals(1, new Solution().solution(new int[]{ 3  },new int[]{ 1 } ));
        assertEquals(1, new Solution().solution(new int[]{ 3  },new int[]{ 0 }));
    }

}