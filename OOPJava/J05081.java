public class J05081 {
    public class MatHang{
        String name;
        String type;
        int in;
        int out;
        public MatHang(String name, String type, int in, int out){
            this.name = name;
            this.type = type;
            this.in = in;
            this.out = out;
        }
        public int LN(){
            return this.out - this.in;
        }
        @Override
        public int toCompare(MatHang mh){
            return this.LN().compare(mh.LN());
        }
    }
    public static void main(String[] args) {
        
    }
}
