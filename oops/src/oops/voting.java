package oops;

class Voter {
    private String voterId;
    private boolean hasVoted;

    public Voter(String id) {
        voterId = id;
        hasVoted = false;  
    }

    public String getVoterId() {
        return voterId;
    }

    public boolean getHasVoted() {
        return hasVoted;
    }

    public void castVote() {
        if (!hasVoted) {
            hasVoted = true;
            System.out.println("Vote cast successfully.");
        } else {
            System.out.println("You have already voted.");
        }
    }
}

public class voting {

	public static void main(String[] args) {
		Voter user1 = new Voter("USER123");

        System.out.println("Voter ID: " + user1.getVoterId());
        user1.castVote(); 
        user1.castVote();

	}

}
