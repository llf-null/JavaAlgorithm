package sort;

public class ListInsertSort {
	static class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			Node next=null;
		}
	}
	public static Node insertSort(Node head) {
		if(head==null||head.next==null) return head;
		Node pre=head;//指向已经有序的节点
		Node cur=head.next;//指向要排序的节点
		Node aux= new Node(-1);//辅助节点
		aux.next=head;
		while(cur!=null) {
			if(cur.data<pre.data) {
				pre.next=cur.next;
				Node l1=aux;
				Node l2=aux.next;
				while(cur.data>l2.data) {
					l1=l2;
					l2=l2.next;
				}
				l1.next=cur;
				cur.next=l2;
				cur=pre.next;
			}else {
				pre=cur;
				cur=cur.next;
			}
		}
		return aux.next;
	}
	public static Node creadList(int[] arr) {
		Node head=new Node(arr[0]);
		Node tail=head;
		for(int i=1;i<arr.length;i++) {
			Node newnode=new Node(arr[i]);
			tail.next=newnode;
			tail=newnode;
		}
		return head;
	}
	public static void printList(Node head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,6,3,2,7};
		Node head= creadList(arr);
		printList(head);
		head=insertSort(head);
		printList(head);
		

	}
}

















