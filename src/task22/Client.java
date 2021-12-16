package task22;

public class Client {
   void Sit(Chair chair){

   }

   public enum ChairType {
      VICTORIAN,
      MULTIFUNCTIONAL,
      MAGIC
   }

   public static Chair createChair(ChairType type) {
      Chair chair = null;

      switch (type) {
         case MULTIFUNCTIONAL:
            chair = new MultifuncionalChair();
            break;
         case VICTORIAN:
            chair = new VictorianChair();
            break;
         case MAGIC:
            chair = new MagicChair();
            break;
      }

      return chair;
   }

   public static void sit(Chair chair){
      chair.output();
   }

   public static void main(String[] args) {
      sit(createChair(ChairType.MULTIFUNCTIONAL));
      sit(createChair(ChairType.VICTORIAN));
      sit(createChair(ChairType.MAGIC));
   }

}
