package adapterPattern;

public class Adaptee {


    private String[] data ;
    private int start =0;
    private int end = -1;
    private  int size =0;

    public Adaptee(int sizeArr)
    {
        // we need reference to the object we
        // are adapting
        data = new String[sizeArr];
    }

    public String startString(){
        return data[start];
    }
    public String endString(){
        return data[end];
    }
    public boolean empty(){
        return ( end == -1 );
    }
    public void add(String str){
        end++;
        data[end] = str;
        size ++;
    }
    public void remove(int pos){
   //remove the String object at position 'pos' and bring //forward all items after it
        for ( int i = pos; i < end; i++ ){
            data[i] = data[i+1];
        }
        start++;
        size --;
    }

    public String get(int pos){
        return data[pos];
    }

    public int size()
    {
        return  size;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }
}
