/*

    In this report I analysis  time complexity of  operations implemented in the PatientList class that
I uploaded. I used single Linkedlist. This LinkeList structure was chosen to manage admitted patients .
That patients in hospital management system where frequent insertions and removals may occur.

    Firstly, the addPatient operation appends a new patient to the end or if list is empty add to head
of the linked list. If we talk about big O in the best case,when the list is empty, the operation takes
constant time O(1) because it is empty and when I add patient it will be a head .  In the worst case, the
algorithm traverse the entire list  by one by to reach or know the last node, resulting in a time complexity
of O(n) because as I said it traverse from head to last node.

    Secondly, the removePatient operation requires searching  according to  given ID ,for the patient.
 If the patientnis available at the head of the list ,removal is real with O(1) but in the worst case, the
 list should be  traversed to finding given data the time complexity O(n).

    Finally, the findPatient operation  performs a sequential search along to  list, leading to
worst-case time complexity of O(n).

    When  I comparing linkedList with an arrayList, I have seen several performance differences . An arrayList
O(1) time complexity for direct access to index, these situation can be advantages for fast look. But,
insertions and deletions in the middle of an ArrayList  shifting elements, resulting in O(n) time
complexity. but  a linkedlist allows insertions oor deletions without shifting elements, making
these operations  efficient once the given node is found. so, linkedlists do not support random access,
and searching for an element still requires O(n) time.

In the end ,  ArrayLists are generally faster for random access, linked lists are more available
for systems like hospital patient management  dynamic insertions and removals.





 */