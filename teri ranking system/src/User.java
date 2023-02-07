
public class User {
    //properties
    private int rank;
    private int progress;

    //constructors
    public User(){
        rank = -8;
        progress = 0;
    }

    //methods
    public int getRank() {
        return rank;
    }
    public int getProgress() {
        return progress;
    }
    public void incProgress(int rankOfActivty) {
        if (rankOfActivty == 0 || rankOfActivty > 8 || rankOfActivty < -8) {
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        }
        if (rankOfActivty < rank){
            progress++;
        }
        else if (rankOfActivty == rank){
            progress += 3;
        }
        else if (rankOfActivty > rank) {
            if (rankOfActivty > 0 && rank < 0) {
                int d = rankOfActivty - rank - 1;
                progress += 10 * d * d;
            }
            else{
                int d = rankOfActivty - rank;
                progress += 10 * d * d;
            }
        }

        while (progress >= 100) {
            if (rank == -1) {
                rank = 1;
            } else {
                rank++;
            }
            progress -= 100;
        }
    }
    public String toString(){
        return "User{" + "rank=" + rank + ", progress=" + progress + '}';
    }






}
