package me.motyim.old.amazon;


import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

class PairInt {
    int first, second;

    public PairInt() {
    }

    public PairInt(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class MyPair {
    PairInt locationOfTargetValue(int rowCount, int columnCount,
                                  List<List<Integer>> matrix, int targetValue) {

        int searchRow = -1;
        int searchCol = -1;
        boolean flag = false;
        for (List<Integer> integers : matrix) {
            searchRow++;
            OptionalInt idx = IntStream.range(0, integers.size()).filter(i -> integers.get(i).equals(targetValue)).findFirst();
            if (idx.isPresent()) {
                searchCol = idx.getAsInt();
                flag=true;
                break;
            }
        }

        if (flag) return new PairInt(searchRow, searchCol);
        else return new PairInt(-1, -1);
    }

}
