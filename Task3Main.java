public class Task3Main {

    public static void main(String[] args) {


        DischargeStack stack = new DischargeStack();

        // ad 5 leaved patient
        stack.push(new DischargeRecord(230444078, System.currentTimeMillis()));
        stack.push(new DischargeRecord(240444022, System.currentTimeMillis()));
        stack.push(new DischargeRecord(230444049, System.currentTimeMillis()));
        stack.push(new DischargeRecord(230441054, System.currentTimeMillis()));
        stack.push(new DischargeRecord(230444014, System.currentTimeMillis()));
        stack.printStack();

        //  (pop )
        System.out.println( "Processing dis charged patients");
        stack.pop();
        stack.pop();


        System.out.println("\nRemaining discharge records:");
        stack.printStack();
    }
}


