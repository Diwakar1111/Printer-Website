public class Brufet{
  public static void main(String[] args) throws InterruptedException{
    String[] target = {"N","I","G","G","A","S","A","U","R","O","U","S"," "};
    String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0",".",",","?","!","@","#","&","+"," "};
    for(int j=0; j<target.length; j++){
      for(int i=0; i<alpha.length; i++){
        System.out.print(alpha[i]);
        Thread.sleep(13);
        if (alpha[i] != target[j]){
          delete();
        }
      }
    }  
  }
  static void delete(){
    System.out.print("\b");
  }
}