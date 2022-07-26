import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Conditions {
    public static void main(String[] args) {
        int testScore = 40;
        if (testScore > 50) {
            System.out.println("congrats");
        }else if (testScore ==50){
            System.out.println("not sure if you are passed");
    }
            else{
                System.out.println("failed");
            }
            switch (testScore){
                case 0 :
                    System.out.println("test?");
                    break;
                case 100 :
                    System.out.println("marks");
                    break;
                default:
                    System.out.println("special");
                    break;

            }
        }
    }

