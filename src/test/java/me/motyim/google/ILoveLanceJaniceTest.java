package me.motyim.google;

import org.junit.Test;


import static org.junit.Assert.*;

public class ILoveLanceJaniceTest {

    @Test
    public void testCapitalLetter(){
        assertEquals("ABCDXYZ",ILoveLanceJanice.solution("ABCDXYZ"));
    }

    @Test
    public void testSmallLetter(){
        assertEquals("zyxw",ILoveLanceJanice.solution("abcd"));
    }

    @Test
    public void testCase0(){
        assertEquals("encryption",ILoveLanceJanice.solution("vmxibkgrlm"));
    }

    @Test
    public void testCase1(){
        assertEquals("Yeah! I can't believe Lance lost his job at the colony!!",
                ILoveLanceJanice.solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));
    }

    @Test
    public void testCase2(){
        assertEquals("did you see last night's episode?",
                ILoveLanceJanice.solution("wrw blf hvv ozhg mrtsg'h vkrhlwv?"));
    }
}