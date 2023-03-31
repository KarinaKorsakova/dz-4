public class PrintClass {

    public int toPrintInt = 20;

    public String Print(){
        String updatedValue = String.format("\"---<%d>---\"%n", toPrintInt);
        System.out.println(updatedValue);
        return updatedValue;
    }


}
