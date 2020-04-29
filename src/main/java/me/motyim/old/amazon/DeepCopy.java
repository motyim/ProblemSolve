package me.motyim.old.amazon;

public class DeepCopy {

    public ALNode deepCopy(ALNode head) {
        ALNode itr = head;
        ALNode bitr;
        while (itr != null) {
            bitr = itr.next;
            itr.next = new ALNode(itr.value);
            itr.next.next = bitr;
            itr = bitr;
        }

        itr = head;
        while (itr != null) {
            if (itr.next != null)
                itr.next.arbitrary = itr.arbitrary == null ? itr.arbitrary : itr.arbitrary.next;
            itr = itr.next == null ? itr.next : itr.next.next;
        }

        itr = head;
        ALNode nitr = itr.next;
        ALNode clone = nitr;
        while (itr != null && nitr != null) {
            itr.next = itr.next == null ? itr.next : itr.next.next;
            nitr.next = nitr.next == null ? nitr.next : nitr.next.next;
            itr = itr.next;
            nitr = nitr.next;
        }
        return clone;
    }
}

class ALNode {
    int value;
    ALNode next;
    ALNode arbitrary;

    public ALNode(int value) {
        this.value = value;
        this.arbitrary = null;
        this.next = null;
    }

    public ALNode() {
        this.value = -1;
        this.arbitrary = null;
        this.next = null;
    }
}