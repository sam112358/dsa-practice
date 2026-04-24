package main.java.com.samarth.revision.two;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int f = 1, l = n;
        while(f<=l){
            int m = f+(l-f)/2;
            if(!isBadVersion(m)){
                f = m+1;
            }else{
                l = m-1;
            }
        }
        return f;
    }

    public boolean isBadVersion(int version) {
        return false;
    }
}
