package IteratorPatterns.Sample9;

public class Main {

    public static void main(String[] args) {

    DataSet ds = new DataSet();
        for(Iterator iterate = ds.getIterator();iterate.hasNext();){
            String content = (String) iterate.Next();
            System.out.println(content);
        }


    }
}
