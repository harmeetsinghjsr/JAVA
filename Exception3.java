class CustomException extends Exception{
    CustomException(String str){
        super(str);
    } 
}
class Exception3{
    public static void main(String[] args) {
        try{
            throw new CustomException("This is a custom exception");
        }catch(CustomException e){
            e.printStackTrace();
           // System.out.println("Caught: "+e.getMessage());
        }
    }
}