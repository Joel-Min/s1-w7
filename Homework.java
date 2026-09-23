public class Homework {
    private String first;
    private String last;

    public String createUserName(String first, String last) {
        int x = first.length() / 2;
        String a = first.substring(0, x);
        String b = first.substring(x);
        String c = "";
        if (last.length() >=3){
            c = last.substring(last.length()-3);
        }
        else{
             c = last;
        }
        return c + first.length() + b + a;
    }


}