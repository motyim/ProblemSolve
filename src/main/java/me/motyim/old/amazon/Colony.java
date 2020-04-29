package me.motyim.old.amazon;

public class Colony {
    public static int[] cellCompete(int[] cells, int days) {

        while (days-- > 0) {
            int[] loopCell = cells.clone();
            for (int i = 0; i < cells.length; i++) {
                if (i == 0)
                    cells[i] = 0 ^ loopCell[i + 1];
                else if (i == cells.length - 1)
                    cells[i] = 0 ^ loopCell[i - 1];
                else
                    cells[i] = loopCell[i - 1] ^ loopCell[i + 1];
            }
        }
        return cells;
    }
}
