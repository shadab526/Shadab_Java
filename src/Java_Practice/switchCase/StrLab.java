package Java_Practice.switchCase;

public class StrLab {
    public static void main(String[] args) {
        String s = "Shadab Shaikh";
        s=s.toLowerCase();
        int v =0, co=0;
        for (int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c!=' '){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    v++;

                }
                else {
                    co++;
                }
            }
        }
        System.out.println(v);
        System.out.println(co);

        }
}
