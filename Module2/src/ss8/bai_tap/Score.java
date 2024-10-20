package ss8.bai_tap;

public class Score {
    public static String setScore(int score) {
        String result = "";
        switch(score)
        {
            case 0:
                result +="Love";
                break;
            case 1:
                result +="Fifteen";
                break;
            case 2:
                result +="Thirty";
                break;
            case 3:
                result +="Forty";
                break;
            default:
                result += "Deuce";
                break;
        }
        return result;
    }
    }

