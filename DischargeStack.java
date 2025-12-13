 public class DischargeStack {

        // Node for stack
        private class Node {

            // Nodes have  DischargeRecord
            DischargeRecord data;

            Node next;

            // Node constructor
            public Node(DischargeRecord data) {
                this.data = data;
                this.next = null;
            }
        }

        //  Show top in stack
        private Node top;

        // empty  stack
        public DischargeStack() {
            top = null;
        }

        // new taburcu patient to stack (push)
        public void push(DischargeRecord record) {
            Node newNode = new Node(record);

            newNode.next = top;

            // new node is top
            top = newNode;
        }

        // shows the top in stack and pop it (pop)
        public DischargeRecord pop() {

            //is stack is empty
            if (top == null) {
                return null;
            }

            DischargeRecord removedRecord = top.data;

            top = top.next;

            return removedRecord;
        }

        // shows top in stack (peek)
        public DischargeRecord peek() {

            // Stack boşsa
            if (top == null) {
                return null;
            }

            return top.data;
        }

        // Shows all leaved patient
        public void printStack() {
            Node current = top;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }


