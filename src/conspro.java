public class conspro {
    int id;
    String name;
    conspro (int a,String s)
    {

        id=a;
        name=s;
        System.out.println("constructor");
    }
    void cat()
    {
        System.out.println(id+" "+name);

    }
    public static void main(String[] args){
        conspro obj1=new conspro( 4,"kutty");
        obj1.cat();
    }


}
