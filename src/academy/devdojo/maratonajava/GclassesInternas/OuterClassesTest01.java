package academy.devdojo.maratonajava.GclassesInternas;

public class OuterClassesTest01 {
    private String name= "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass= new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();

        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();

    }
}
