package ss8.bai_tap;

public class Ex {
    public static String getScore( int scoreFirstPlayer, int scoreSencondPlayer) {
        String score = "";
        int tempScore;
        if (scoreFirstPlayer==scoreSencondPlayer)
        {
//            switch (scoreFirstPlayer)
//            {
//                case 0:
//                    score = "Love-All";
//                    break;
//                case 1:
//                    score = "Fifteen-All";
//                    break;
//                case 2:
//                    score = "Thirty-All";
//                    break;
//                case 3:
//                    score = "Forty-All";
//                    break;
//                default:
//                    score = "Deuce";
//                    break;
//
//            }
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

            }
        }
        return score;
    }

}
