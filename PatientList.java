public class PatientList {
    Node head;
//Now I have a head


    public void  addPatient(Patient p){
       Node newNode=new Node(p);
        if(head==null){              //there is my addition method

            head= newNode;          // if list is empty my first element head
            return;}

        Node trv =head;
        while(trv.next!=null){                //and add last element
            trv=trv.next;}


        trv.next=newNode;}

    public void removePatient(int id){
        if (head==null){   //hata vermemesi için yazdım eğer list boşsa devam etsin diye
            return;
        }

        //case1 baştan silme
        if(head.data.id==id){
            head=head.next;
        }


        //case2 ortadan veya bulunan idyi silme


        Node trv =head;
        while(trv.next!=null){
            if(trv.next.data.id==id){
                trv.next=trv.next.next;
            }
            trv=trv.next;
        return;
        }
    }


    public Patient findPatient (int id) {

        Node trv= head;
        while(trv !=null){                        // at here we can find wanted patient
            if(trv.data.id==id){
                return trv.data;
            }
            trv=trv.next;
        }
        return null;

    }



    public void printList(){
        Node trv=head;

        if(head==null){
            System.out.println("List is empty");}


        while(trv!=null) {
            System.out.println(trv.data.id+" ");
            trv=trv.next;}

        System.out.println();}



}