public class NullPoint {
    public static void main(String[] args){
        String text = null;
        try{
            int length = text.length();
        }catch(NullPointerException e){
            System.err.println("Caught NullPointException"+ e.getMessage());
        }
    }
}
