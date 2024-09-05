public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void printList(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current= current.next;

        }
        System.out.print("null");

    }
  public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
  public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.printList();
        System.out.println(sll.deleteFirst().data);
        sll.printList();
  }
}
