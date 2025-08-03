import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class susbfolder {
    public static void main(String[] args) {
        String[] folder={"/a","/a/b","/c/d","/c/d/e","/c/f"};
        Arrays.sort(folder);
        
        List<String> ls=new ArrayList<>();
        ls.add(folder[0]);
        int ptr=0;
        for (int i = 1; i < folder.length; i++) {
            String curr=folder[i];
            String prev=ls.get(ptr)+"/";

            if(!curr.startsWith(prev)){
                ls.add(curr);
                ptr++;
            }
        }


        System.out.println(ls);
    }

}
