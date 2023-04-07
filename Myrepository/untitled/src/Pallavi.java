import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pallavi
{


    public static List<String> missingwords(String t, String s)
    {
        if(t.length() == 0) {
            return Arrays.asList(s.split(" "));
        }

        String[] ts = t.split(" ");

        for(int i = 0; i < ts.length; i++){
            if(s.indexOf(ts[i]) != -1) {
                s = s.replaceFirst(ts[i], "");
            }
        }
        return Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        String s = "am hackerrank to improve";
        String t = "I am using hackerrank to improve programming";
        System.out.println(Pallavi.missingwords(s,t));
    }


}
