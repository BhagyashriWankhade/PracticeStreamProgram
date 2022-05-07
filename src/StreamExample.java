import java.util.Arrays;
import java.util.Optional;

public class StreamExample {
    public static void main(String[] args) {
        String[] carNames = new String[]
                {"BMW","Mercedes","Audi","Ferrari","Tesla","Maruti 800"};
        Optional<String> optional = Arrays.stream(carNames).findFirst();
        if(optional.isPresent()) {
            try {
                String result = optional.get();
                System.out.println("car you got is:"+result+" :)");
            } catch(NullPointerException e) {
                System.out.println("NullPointerException occurred," +"as element inside Optional was Null!");
            }
        } else {
            System.out.println("No car for you:(");
        }
    }
}
