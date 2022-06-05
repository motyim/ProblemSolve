package me.motyim.training.dp;

public class Steps {

    public int countPaths(int steps) {
        if (steps < 0) return 0;
        if (steps == 0) return 1;
        return countPaths(steps - 3) + countPaths(steps - 2) + countPaths(steps - 1);
    }

    // region Memorization
    // much faster but with N space
    public int countPathsMemoWapper(int steps) {
        return countPathsMemo(steps, new int[steps + 1]);
    }

    public int countPathsMemo(int steps, int memo[]) {
        if (steps < 0) return 0;
        if (steps == 0) return 1;
        if (memo[steps] == 0) {
            memo[steps] = countPathsMemo(steps - 3, memo)
                    + countPathsMemo(steps - 2, memo)
                    + countPathsMemo(steps - 1, memo);
        }
        return memo[steps];
    }
    //endregion

    //region Dynamic programming
    // with N-time & N-space
    public int countPathsDp(int steps) {
        if (steps < 0) return 0;
        if (steps <= 1) return 1;
        int[] paths = new int[steps + 1];
        paths[0] = 0;
        paths[1] = 1;
        paths[2] = 2;
        for (int i = 3; i <= steps ; i++) {
            paths[i] = paths[i - 1] + paths[i - 2] + paths[i - 3];
        }
        return paths[steps];
    }

    // with N-time & 1-Space
    public int countPathsDpI(int steps) {
        if (steps < 0) return 0;
        if (steps <= 1) return 1;
        int[] paths = {0,1,2};

        for (int i = 3; i <= steps ; i++) {
            int count = paths[2]+paths[1]+paths[0];
            paths[0]=paths[1];
            paths[1]=paths[2];
            paths[2]=count;
        }
        return paths[2];
    }
    //endregion

}
