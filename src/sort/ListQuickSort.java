package sort;

import sort.ListInsertSort.Node;

public class ListQuickSort {
	static class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			Node next=null;
		}
	}
	public static Node listQuickSort(Node head) {
		Node begin=head;
		while(head!=null&&head.next!=null) {
			head=head.next;
		}
		Node end=head;
		begin=quickSort(begin,end);
		return begin;
	}
	public static Node quickSort(Node begin, Node end) {

        //判断为空，判断是不是只有一个节点
        if (begin == null || end == null || begin == end)
            return begin;
        //从第一个节点和第一个节点的后面一个几点
        //begin指向的是当前遍历到的最后一个<= nMidValue的节点
        Node first = begin;
        Node second = begin.next;
 
        int nMidValue = begin.data;
        //结束条件，second到最后了
        while (second != end.next && second != null) {//结束条件
          //一直往后寻找<=nMidValue的节点，然后与fir的后继节点交换
            if (second.data < nMidValue) {
                first = first.next;
                //判断一下，避免后面的数比第一个数小，不用换的局面
                if (first != second) {
                    int temp = first.data;
                    first.data = second.data;
                    second.data = temp;
                }
            }
            second = second.next;
        }
        //判断，有些情况是不用换的，提升性能
        if (begin != first) {
            int temp = begin.data;
            begin.data = first.data;
            first.data = temp;
        }
        //前部分递归
        quickSort(begin, first);
        //后部分递归
        quickSort(first.next, end);
        return begin;
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
		int[] arr= {1,6,3,2,7,4,3,2,7};
		Node head= creadList(arr);
		printList(head);
		head=listQuickSort(head);
		printList(head);

	}
}
