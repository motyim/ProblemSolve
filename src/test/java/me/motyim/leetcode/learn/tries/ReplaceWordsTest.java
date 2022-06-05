package me.motyim.leetcode.learn.tries;

import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ReplaceWordsTest {

    @Test
    public void testCase0(){
        String result = new ReplaceWords().replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery");
        Assertions.assertEquals("the cat was rat by the bat", result);

    }

}