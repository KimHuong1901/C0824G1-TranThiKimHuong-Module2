package ss8.bai_tap;

public class TennisGame {

    public static String getScore( int scoreFirstPlayer, int scoreSencondPlayer) {
        String score = "";
        int tempScore;
        if (scoreFirstPlayer==scoreSencondPlayer)
        {
            score = Score.setScore(scoreFirstPlayer) + "-All" ;
        }
        else if (scoreFirstPlayer>=4 || scoreSencondPlayer>=4)
        {
            int minusResult = scoreFirstPlayer-scoreSencondPlayer;
            if (minusResult==1) {
                score ="Advantage player1";
            }
            else if (minusResult ==-1) {
                score ="Advantage player2";
            }
            else if (minusResult>=2) {
                score = "Win for player1";
            }
            else {
                score ="Win for player2";
            }
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) {
                    tempScore = scoreFirstPlayer;
                } else {
                    score+="-"; tempScore = scoreSencondPlayer;
                }
                score = Score.setScore(tempScore);
            }
        }
        return score;
    }

}
