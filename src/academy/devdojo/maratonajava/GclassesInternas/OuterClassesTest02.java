package academy.devdojo.maratonajava.GclassesInternas;

public class OuterClassesTest02 {
    private String name = "Midoriya";
    void print(){
        final String lastName = "Izuku";
        class LocalClass{
            public void printLocal(){
                System.out.println(name+" "+lastName);
            }
        }
        //LocalClass localClass= new LocalClass();
        //localClass.printLocal(); ou
        new LocalClass().printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer= new OuterClassesTest02();
        outer.print();
    }
}
