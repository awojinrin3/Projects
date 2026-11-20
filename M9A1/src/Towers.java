// Name: Abidemi Awojinrin
// This class demonstrates recursion using the Towers of Hanoi problem.

public class Towers {
    private int numDiscs;

    // Stores the number of discs and starts the recursive process.
    public Towers(int n) {
        this.numDiscs = n;
        this.moveDiscs(this.numDiscs, 1, 3, 2);
    }

    // Recursively moves the discs from one peg to another.
    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
        if (num > 0) {
            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);

            System.out.println("Move a disc from peg " + fromPeg
                    + " to peg " + toPeg);

            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }
}
