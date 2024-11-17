package Solve;

public class J04003 {
    private long ts,ms;
    public J04003(long ts, long ms){
        this.ts = ts;
        this.ms = ms;
    }
    public long getTs(){
        return ts;
    }
    public long getMs(){
        return ms;
    }
    public void setTs(long ts){
        this.ts = ts;
    }
    public void  setMs(long ms){
        this.ms = ms;
    }
    public static long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public void toigian(){
        long GCD = gcd(this.ts,this.ms);
        this.ts /= GCD;
        this.ms /= GCD;
    }
}
