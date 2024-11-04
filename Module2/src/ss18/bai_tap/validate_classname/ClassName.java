package ss18.bai_tap.validate_classname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ClassName {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String CLASS_NAME_REGEX = "^[CAP]*[0-9{4}]*[GHIK]$";
    public ClassName(){
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
            return matcher.matches();
    }
}
