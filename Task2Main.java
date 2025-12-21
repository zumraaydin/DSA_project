public class Task2Main {


        public static void main(String[] args) {

            TreatmentQueue queue = new TreatmentQueue();

            // 8 new patient here
            queue.enqueue(new TreatmentRequest(1));
            queue.enqueue(new TreatmentRequest(2));
            queue.enqueue(new TreatmentRequest(3));
            queue.enqueue(new TreatmentRequest(4));
            queue.enqueue(new TreatmentRequest(5));
            queue.enqueue(new TreatmentRequest(6));
            queue.enqueue(new TreatmentRequest(7));
            queue.enqueue(new TreatmentRequest(8));

            // three deqoueu operation
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();

            //print queue
            System.out.println("Remaining treatment requests:");
            queue.printQueue();

            System.out.println("Queue size: " + queue.size());
        }
    }


